package lesson_4.cars;

public class Lorry extends Car {

    private String carryingCapacity;

    public Lorry(String carMark, String carClass, String carWeight, Engine carMotor, String carryingCapacity) {
        super(carMark, carClass, carWeight, carMotor);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик: марка - " + carMark + ", класс - " + carClass + ", вес - " + carWeight + ", мотор - " + carMotor + ", грузоподъемность куза - " + carryingCapacity);
    }
}
