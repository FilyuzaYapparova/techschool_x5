package lesson_4.shape;

public class Circle implements Shape {
    private double circleRadius;
    private double pi = 3.1415;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double square() {
        return circleRadius * circleRadius * pi;
    }
}
