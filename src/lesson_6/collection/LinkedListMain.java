package lesson_6.collection;

public class LinkedListMain {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Filyuza");
        list.add("Mariya");
        list.add("Marina");
        System.out.println(list);
        System.out.println("Размерность листа = " + list.size());
        try {
            System.out.println("Четвертый элемент листа = " + list.get(4));
        } catch (Exception e) {
        }
        System.out.println("Второй элемент листа = " + list.get(1));
        System.out.println("Третий элемент листа = " + list.get(2));
        //remove
        list.remove(0);
        list.add("Azat");
        list.remove("Azaliya");
        list.remove(new String ("Marina"));
        System.out.println(list);
        System.out.println("Размерность листа = " + list.size());
        list.clear();
        System.out.println(list);
        System.out.println("Размерность листа = " + list.size());

    }
}
