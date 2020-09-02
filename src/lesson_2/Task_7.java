package lesson_2;

public class Task_7 extends BaseTask {
    void printMessage(String city, double cost) {
        printLine(city + ". Стоимость разговора: " + (cost * 10));
    }


    void city(int code) {
        String city;
        double cost;
        switch (code) {
            case 905:
                city = "Москва";
                cost = 4.15;
                break;
            case 194:
                city = "Ростов";
                cost = 1.98;
                break;
            case 491:
                city = "Краснодар";
                cost = 2.69;
                break;
            case 800:
                city = "Киров";
                cost = 5.00;
                break;
            default:
                city = "Неизвестно";
                cost = 0.00;
                break;
        }
        printMessage(city, cost);
    }


    public static void main(String[] args) {
        new Task_7().main();
    }

    @Override
    public void run() {
        printLine("Введите код города");
        if (isScannerHasNextInt()) {
            int cityCode = readInt();
            city(cityCode);
        } else {
            printLine("Вы ввели не целое число");
        }
    }
}
