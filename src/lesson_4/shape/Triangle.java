package lesson_4.shape;

public class Triangle implements Shape {

    private double a; //основание
    private double h; //высота

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        return 0.5 * a * h;
    }
}
