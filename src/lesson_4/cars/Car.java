package lesson_4.cars;

public abstract class Car {
    protected String carMark;
    protected String carClass;
    protected String carWeight;
    protected Engine carMotor;

    public Car(String carMark, String carClass, String carWeight, Engine carMotor) {
        this.carMark = carMark;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.carMotor = carMotor;
    }

    abstract void start();

    abstract void stop();

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

    abstract void printInfo();
}
