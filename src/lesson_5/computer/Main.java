package lesson_5.computer;

import lesson_5.computer.facade.ComputerBuildingFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerBuildingFacade facade = new ComputerBuildingFacade();
        Computer computer = new Computer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для чего выбираете компьютер? Введите GAME или WORK");

        try {
            ComputerType computerType = ComputerType.valueOf(scanner.nextLine());
            facade.build(computer, computerType);
            System.out.println(computer);
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка");
        }

    }
}
