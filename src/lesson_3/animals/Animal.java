package lesson_3.animals;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected void makeNoise() {
        System.out.println("");
    }

    protected void eat() {
        System.out.println("");
    }

    protected void sleep() {
        System.out.println("");
    }
}
