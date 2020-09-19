package lesson_6.collection;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Размерность листа = " + list.size());
        list.add("Filyuza");
        System.out.println("Размерность листа = " + list.size());
        System.out.println("Первый элемент листа = " + list.get(0));
        list.add("Marina");
        System.out.println("Размерность листа = " + list.size());
        list.add("Mariya");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(0);
        list.clear();
        System.out.println(list);
        list.add("Filyuza");
        list.add("Marina");
        list.add("Mariya");
        System.out.println(list);
        list.remove("Azat");
        list.remove(new String("Mariya"));
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
