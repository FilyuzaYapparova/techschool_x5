package lesson_3.animals;

public class Horse extends Animal {
    String color;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Прррррррррр");
    }

    @Override
    void eat() {

    }
}
