package lesson_3.animals;

public class Main {
    public static void main(String[] args) {
        Ветеринар вет = new Ветеринар();
        Animal[] animals = {
                new Cat("Кошачья вкусняшка", "Кошачий домик"),
                new Dog("Собачья вкусняшка", "Собачий домик"),
                new Horse("Коняшкина вкусняшка", "Коняшкин домик")
        };
        for (int i = 0; i < animals.length; i++) {
            вет.treatAnimal(animals[i]);
        }
    }
}
