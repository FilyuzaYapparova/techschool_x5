package lesson_8;

import lesson_7.AccountService;
import lesson_7.exceptions.NotEnoughMoneyException;
import lesson_7.exceptions.UnknownAccountException;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static lesson_7.Main.help;
import static lesson_7.Main.run;

public class Main {

    private static void checkJdbcDriver() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println("Connecting to DataBase....");
        checkJdbcDriver();
        try (
                Connection connection = DriverManager.getConnection("jdbc:h2:./src/lesson_8/Accounts");
                Scanner scanner = new Scanner(System.in);
        ) {
            DbUtil.createTable(connection);
            DbUtil.initializeWithValues(connection);
            DbUtil.selectAll(connection);
            System.out.println("");
            AccountService accountService = new DbAccountService(connection);

            help();

            while (run(scanner, accountService)) {
            }

        } catch (SQLException | UnknownAccountException | NotEnoughMoneyException exception) {
            exception.printStackTrace();
        }
    }
}
