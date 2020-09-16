package lesson_3.animals;

public class Cat extends Animal {
    private String breed;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " + food);
    }

    @Override
    protected void sleep() {
        System.out.println("Кот спит в " + location);
    }
}
