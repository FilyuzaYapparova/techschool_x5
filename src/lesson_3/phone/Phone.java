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
        number = "000";
        model = "Apple";
        weight = "0.100 g";
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " - " + number);
    }

    public void sendMessage(String... numbers) {
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
