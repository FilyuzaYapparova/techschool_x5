package lesson_3.phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void main(String[] args) {
        Phone iphone = new Phone("+79000010101", "XR", "0.194 g");
        Phone samsung = new Phone("+79999999999", "Galaxy A7", "0.179 g");
        Phone honor = new Phone("+78008008080", "9 lite", "0.149 g");
        System.out.println(iphone);
        iphone.getNumber();
        iphone.receiveCall("Директор");
        iphone.receiveCall("Директор", "123");
        System.out.println(samsung);
        samsung.getNumber();
        samsung.receiveCall("Сбербанк");
        samsung.receiveCall("Сбербанк", "900");
        System.out.println(honor);
        honor.getNumber();
        honor.receiveCall("Папа");
        honor.receiveCall("Папа", "999");
        iphone.sendMessage("123","234","345");
        samsung.sendMessage("223","234","345");
        honor.sendMessage("323","234","345");
    }

    public String getNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " - " + number);
    }

    void sendMessage(String... numbers) {
        System.out.println("Сообщения направлены на номера: " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
