package lesson_4.shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3.56, 2.5);
        shape[1] = new Circle(3.09);
        shape[2] = new Rectangle(2, 5.12);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square() + ", с округлением = " + Math.round(sh.square()));
        }
    }
}
