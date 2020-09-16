package lesson_3.animals;

public class AnimalDoctor {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.food + ", " + animal.location);
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }
}
