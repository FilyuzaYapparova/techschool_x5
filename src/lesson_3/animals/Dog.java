package lesson_3.animals;

public class Dog extends Animal {
    private boolean pedigree;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит в " + location);
    }
}
