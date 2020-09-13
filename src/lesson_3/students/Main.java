package lesson_3.students;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Анна","Яковлева","G-103",5),
                new Student("Олег","Соловьев","H-100",4),
                new Aspirant("Екатерина","Иванова","L-614",4,"Теория относительности"),
                new Aspirant("Геннадий","Игорев","K-404",5,"Законы информации")
        };
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}
