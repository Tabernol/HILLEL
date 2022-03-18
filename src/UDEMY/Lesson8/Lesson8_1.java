package UDEMY.Lesson8;

public class Lesson8_1 {
    static final double pi = 3.14;
    double radius;

    public double squareCircle(double radius) {
        double result = pi * (radius * radius);
        return result;
    }

    public static double circleLength(double radius1) {
        double result = 2 * pi * radius1;
        return result;
    }

    public void showInfoCircle(double radius2) {
        System.out.println(radius2);
        System.out.println("Площадь круга: " + squareCircle(radius2));
        System.out.println("Длина окружности: " + circleLength(radius2));
    }
}

class Test1 {
    public static void main(String[] args) {
        Lesson8_1 tes = new Lesson8_1();
        System.out.println("square" + tes.squareCircle(5.5));
        System.out.println("length" + Lesson8_1.circleLength(4.4));
        tes.showInfoCircle(3.0);
    }
}
