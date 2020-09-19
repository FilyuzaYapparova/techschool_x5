package lesson_6.collection;

import java.util.Objects;

public class LinkedList<E> implements List<E> {

    private int listSize = 0;

    private static class Element<E> {
        Element<E> previous;
        E value;
        Element<E> next;

        public Element(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "element=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    private Element<E> first;


    @Override
    public int size() {
        return listSize;
    }

    @Override
    public void add(E item) {
        if (first == null) {
            first = new Element<>(item);
        } else {
            Element<E> newElement = new Element<>(item);
            Element<E> saveElement = first;
            while (saveElement.next != null) {
                saveElement = saveElement.next;
            }
            saveElement.next = newElement;
            newElement.previous = saveElement;
        }
        listSize++;
    }

    @Override
    public void remove(int index) {
        Element<E> element = getElement(index);
        if (listSize == 1) {
            clear();
        } else if (element.next == null) {
            element.previous.next = null;
        } else if (element.previous == null) {
            element.next.previous = null;
            first = element.next;
        } else {
            element.previous.next = element.next;
            element.next.previous = element.previous;
        }
        listSize--;
    }

    @Override
    public void remove(E item) {
        Element<E> element = first;
        while (!Objects.equals(element.value,item)) {
            element = element.next;
            if (element == null) {
                System.out.println("Ошибка поиска элемента " + item);
                return;
            }
        }
        if (listSize == 1) {
            clear();
        } else if (element.next == null) {
            element.previous.next = null;
        } else if (element.previous == null) {
            element.next.previous = null;
            first = element.next;
        } else {
            element.previous.next = element.next;
            element.next.previous = element.previous;
        }
        listSize--;
    }

    @Override
    public E get(int index) {
        return getElement(index).value;
    }

    private Element<E> getElement(int index) {
        if ((index < 0) || (index > size())) {
            System.out.println("Ошибка ввода индекса");
            throw new IndexOutOfBoundsException();
        } else {
            Element<E> searchElement = first;
            for (int i = 0; i < index; i++) {
                searchElement = searchElement.next;
            }
            return searchElement;
        }
    }

    @Override
    public void clear() {
        first = null;
        listSize = 0;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                '}';
    }
}
