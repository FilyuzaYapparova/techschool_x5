package lesson_3.animals;

public class Dog extends Animal {
    boolean pedigree;

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
    protected void sleep() {
        System.out.println("Собака спит в " + location);
    }
}
