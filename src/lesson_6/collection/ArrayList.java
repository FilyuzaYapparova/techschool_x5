package lesson_6.collection;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<E> implements List<E> {

    private E[] array = (E[]) new Object[0];

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(E item) {
        E[] newArray = (E[]) new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = item;
        array = newArray;
    }

    @Override
    public void remove(int index) {
        E[] newArray = (E[]) new Object[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
    }

    @Override
    public void remove(E item) {
        int index = -1;
        E[] newArray = (E[]) new Object[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i],item)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Элемент " + item + " не найден");
            return;
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        E[] emptyArray = (E[]) new Object[0];
        array = emptyArray;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
