package HILLEL;

import hw5.Car;
import hw5.Coupe;
import hw5.Limousine;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("accord", 60, 3);
        Coupe cupe = new Coupe("porsche", 80, 4, 2);
        Limousine limousine = new Limousine("Cadillac", 50, 3, 15);
    }
}
