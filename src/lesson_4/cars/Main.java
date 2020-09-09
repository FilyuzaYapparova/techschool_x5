package lesson_4.cars;

public class Main {
    public static void main(String[] args) {
        Engine manEngine = new Engine("50-2000 hp", "Sinotruk");
        Engine dafEngine = new Engine("410-2500 hp", "Paccar");
        Lorry man = new Lorry("MAN", "C", "10 tonn", manEngine, "1 tonn");
        Lorry daf = new Lorry("DAF", "C", "10,5 tonn", dafEngine, "1,5 tonn");
        Engine mcLarenEngine = new Engine("916 hp", "MCLaren");
        Engine koenigseggEngine = new Engine("939 hp", "Koenigsegg");
        SportCar mcLaren = new SportCar("mcLaren", "B", "", mcLarenEngine, "350 km/h");
        SportCar koenigsegg = new SportCar("koenigsegg", "B", "", koenigseggEngine, "390 km/h");

        Car[] cars = {man, daf, mcLaren, koenigsegg};

        for (Car car : cars) {
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
        }
    }
}
