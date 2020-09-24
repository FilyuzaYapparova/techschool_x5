package lesson_7;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static File file = new File("src" + File.separator + "lesson_7" + File.separator + "Accounts.txt");

    public static void help() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                                                                              |");
        System.out.println("|   balance [id] - вывести информацию о счёте                                  |");
        System.out.println("|   withdraw [id] [amount] - снять указанную сумму                             |");
        System.out.println("|   deposit [id] [amount] - внести на счет указанную сумму                     |");
        System.out.println("|   transfer [from] [to] [amount] - перевести сумму с одного счета на другой   |");
        System.out.println("|   exit - выход из программы                                                  |");
        System.out.println("|                                                                              |");
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException {


        boolean fileExists = file.exists();
        if (!fileExists){
            System.out.println("no file, creating");
            boolean newFile = file.createNewFile();
            System.out.println("created " + newFile);
        }
        try (
                Scanner scanner = new Scanner(System.in);
                BufferedReader reader = new BufferedReader(new FileReader(file));
        ) {
            FileAccountManager accounts = new FileAccountManager(reader, fileExists);


            help();

            while (true) {
                System.out.println("Какую операцию вы хотите выполнить?");
                String[] command = scanner.nextLine().split(" ");
                String operation = command[0];
                switch (operation) {
                    case "help":
                        help();
                        break;
                    case "balance":
                        accounts.balance(Integer.parseInt(command[1]));
                        break;
                    case "withdraw":
                        accounts.withdraw(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                        break;
                    case "deposit":
                        accounts.deposit(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                        break;
                    case "transfer":
                        accounts.transfer(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                        break;
                    case "exit":
                        try (
                                PrintWriter writer = new PrintWriter(new FileWriter(file));
                        ) {
                            accounts.writeFile(writer);
                        }
                        return;
                    default:
                        System.out.println("Ошибка ввода операции. Повторите попытку");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}