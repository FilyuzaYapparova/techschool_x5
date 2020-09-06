package lesson_3.animals;

public class Cat extends Animal {
    String breed;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу мяу");
    }

    @Override
    void eat() {

    }
}
