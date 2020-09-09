package lesson_4.shape;

public class Rectangle implements Shape {

    private double a; //сторона а
    private double b; //сторона в

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }
}
