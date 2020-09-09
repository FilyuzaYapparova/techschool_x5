package lesson_4.cars;

public class SportCar extends Car {

    private String topSpeed;

    public SportCar(String carMark, String carClass, String carWeight, Engine carMotor, String topSpeed) {
        super(carMark, carClass, carWeight, carMotor);
        this.topSpeed = topSpeed;
    }

    @Override
    public void start(){
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop(){
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Спортивный автомобиль: марка - " + carMark + ", класс - " + carClass + ", вес - " + carWeight + ", мотор - " + carMotor + ", максимальная скорость - " + topSpeed);
    }
}
