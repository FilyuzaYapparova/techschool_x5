package lesson_6.fruit_basket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        System.out.println("Сколько яблок хотите добавить в корзину?");
        if (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                appleBox.addFruit(new Apple());
            }
        } else {
            System.out.println("Ошибка подсчета яблок");
        }
        System.out.println("Сколько апельсинов хотите добавить в корзину?");
        if (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                orangeBox.addFruit(new Orange());
            }
        } else {
            System.out.println("Ошибка подсчета апельсинов");
        }
        System.out.println("Вес корзины яблок = " + appleBox.getWeight());
        System.out.println("Вес корзины апельсинов = " + orangeBox.getWeight());
        System.out.println("Корзины равны? - " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();

        System.out.println("Вес корзины яблок №1 = " + appleBox.getWeight());
        System.out.println("Вес корзины яблок №2 = " + anotherAppleBox.getWeight());

        appleBox.moveFruit(anotherAppleBox);

        System.out.println("Вес корзины яблок №1 после пересыпки = " + appleBox.getWeight());
        System.out.println("Вес корзины яблок №2 после пересыпки = " + anotherAppleBox.getWeight());

        scanner.close();
    }
}
