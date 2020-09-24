package lesson_7;

import lesson_7.exceptions.NotEnoughMoneyException;
import lesson_7.exceptions.UnknownAccountException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAccountManager implements AccountService {

    private BufferedReader bufferedReader;
    private Map<Integer, Account> accounts = new HashMap<>();

    public FileAccountManager(BufferedReader bufferedReader, boolean fileExists) throws IOException {
        this.bufferedReader = bufferedReader;
        if (!fileExists) {
            initializeWithValues();
        } else {
            readFile();
        }
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = accounts.get(accountId);
        if (account != null) {
            if (account.getAmount() >= amount) {
                account.setAmount(account.getAmount() - amount);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownAccountException(accountId);
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        if (accounts.get(accountId) != null) {
            System.out.println(accounts.get(accountId).getAmount());
        } else {
            throw new UnknownAccountException(accountId);
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        Account account = accounts.get(accountId);
        if (account != null) {
            account.setAmount(account.getAmount() + amount);
        } else {
            throw new UnknownAccountException(accountId);
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = accounts.get(from);
        Account toAccount = accounts.get(to);
        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getAmount() >= amount) {
                toAccount.setAmount(toAccount.getAmount() + amount);
                fromAccount.setAmount(fromAccount.getAmount() - amount);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            if (fromAccount == null) {
                throw new UnknownAccountException(from);
            } else {
                throw new UnknownAccountException(to);
            }
        }
    }

    public void initializeWithValues() {
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i + 1, "Holder №" + (i + 1), Math.round(Math.random() * 100000));
            accounts.put(i + 1, account);
        }
    }


    public void readFile() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            accounts.put(id, new Account(id, arr[1], Double.parseDouble(arr[2])));
        }
    }


    public void writeFile(PrintWriter printWriter) {
        for (Integer id : accounts.keySet()) {
            printWriter.println(accounts.get(id));
        }
    }
}
