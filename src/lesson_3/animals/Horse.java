package lesson_3.animals;

public class Horse extends Animal {
    private String color;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Прррррррррр");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит в " + location);
    }
}
