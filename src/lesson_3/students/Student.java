package lesson_3.students;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    protected int getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
