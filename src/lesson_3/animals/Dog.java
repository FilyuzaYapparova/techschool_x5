package lesson_3.animals;

public class Dog extends Animal {
    boolean pedigree;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Гав гав");
    }

    @Override
    void eat() {

    }
}
