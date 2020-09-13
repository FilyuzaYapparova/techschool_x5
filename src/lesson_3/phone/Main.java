package lesson_3.phone;

public class Main {
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
}
