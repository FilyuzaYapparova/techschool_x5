package lesson_6.fruit_basket;

import lesson_6.collection.ArrayList;
import lesson_6.collection.List;

public class Box<T extends Fruit> {

    private List<T> fruitList = new ArrayList<>();

    public double getWeight() {
        if (fruitList.size() == 0) {
            return 0;
        } else {
            return fruitList.size() * fruitList.get(0).getWeight();
        }
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return anotherBox.getWeight() == this.getWeight();
    }

    public void moveFruit(Box<T> anotherBox) {
        for (int i = 0; i < fruitList.size(); i++) {
            anotherBox.addFruit(fruitList.get(i));
        }
        fruitList.clear();
    }
}
