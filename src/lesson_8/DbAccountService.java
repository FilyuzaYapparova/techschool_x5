package lesson_8;

import lesson_7.Account;
import lesson_7.AccountService;
import lesson_7.exceptions.NotEnoughMoneyException;
import lesson_7.exceptions.UnknownAccountException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbAccountService implements AccountService {

    private Connection connection;

    public DbAccountService(Connection connection) {
        this.connection = connection;
    }

    private Account findAccountById(int accountId) throws UnknownAccountException {
        String sql = "SELECT * FROM Account " +
                "WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String holder = resultSet.getString("holder");
                double amount = resultSet.getDouble("amount");
                return new Account(id, holder, amount);
            } else {
                throw new UnknownAccountException(accountId);
            }
        } catch (
                SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void saveAccount(Account account) {
        String sql = "UPDATE Account " +
                "SET holder = ?, amount = ? " +
                "WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, account.getHolder());
            preparedStatement.setDouble(2, account.getAmount());
            preparedStatement.setInt(3, account.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = findAccountById(accountId);
        if (account.getAmount() >= amount) {
            account.setAmount(account.getAmount() - amount);
            saveAccount(account);
        } else {
            throw new NotEnoughMoneyException();
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        System.out.println(findAccountById(accountId).getAmount());
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        Account account = findAccountById(accountId);
        account.setAmount(account.getAmount() + amount);
        saveAccount(account);
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = findAccountById(from);
        Account toAccount = findAccountById(to);
        if (fromAccount.getAmount() >= amount) {
            toAccount.setAmount(toAccount.getAmount() + amount);
            fromAccount.setAmount(fromAccount.getAmount() - amount);
            saveAccount(fromAccount);
            saveAccount(toAccount);
        } else {
            throw new NotEnoughMoneyException();
        }
    }
}
