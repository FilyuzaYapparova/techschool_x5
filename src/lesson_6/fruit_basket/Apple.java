package lesson_6.fruit_basket;

public class Apple extends Fruit {

    private double weight;

    public Apple() {
        weight = 1.0;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
