package lesson_3.students;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant() {
    }

    @Override
    int getScholarship() {
        if (averageMark == 5)
            return 200;
        else
            return 180;
    }
}
