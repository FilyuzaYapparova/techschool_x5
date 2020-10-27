package lesson_6.collection;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<E> implements List<E> {

    private final int INITIAL_SIZE = 1;
    private E[] array = (E[]) new Object[INITIAL_SIZE];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        if (size == array.length) {
            E[] newArray = (E[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = item;
        size++;
    }

    @Override
    public void remove(int index) {
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    @Override
    public void remove(E item) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i],item)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Элемент " + item + " не найден");
            return;
        }
        remove(index);
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array = (E[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
