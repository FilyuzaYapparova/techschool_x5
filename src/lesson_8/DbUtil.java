package lesson_8;

import java.sql.*;

public class DbUtil {
    public static void createTable(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Account (" +
                    "id int primary key," +
                    "holder varchar(255)," +
                    "amount double" +
                    ");");
        }
    }

    public static void initializeWithValues(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT count (*) FROM Account");
            if (resultSet.next()) {
                if (resultSet.getInt(1) > 0) {
                    return;
                }
            }
        }
        System.out.println("Initializing table .....");
        try (Statement statement = connection.createStatement()) {
            for (int i = 0; i < 10; i++) {
                statement.execute("INSERT INTO Account (id, holder, amount)" +
                        "VALUES (" + (i + 1) + ", " +
                        "'Holder №" + (i + 1) + "', " +
                        Math.round(Math.random() * 100000) + ");");
            }
        }
    }

    public static void selectAll(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Account");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String holder = resultSet.getString("holder");
                double amount = resultSet.getDouble("amount");
                System.out.println(id + " " + holder + " " + amount);
            }
        }
    }
}
