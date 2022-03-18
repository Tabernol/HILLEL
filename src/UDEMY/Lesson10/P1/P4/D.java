package UDEMY.Lesson10.P1.P4;

import UDEMY.Lesson10.P1.*;
import UDEMY.Lesson10.P1.P2.B;
import UDEMY.Lesson10.P1.P2.P3.*;

import static UDEMY.Lesson10.P1.P2.B.*;

import UDEMY.Lesson10.P1.P4.P5.*;

import java.sql.SQLOutput;

public class D {
    public static void main(String[] args) {
        A d1 = new A();
        d1.sum(4, 5);
        C c1 = new C();
        System.out.println(c1.name);
        double square = 5 * 5 * B.PI;
        System.out.println(square);
        E e1 = new E("Smith", 34);
        System.out.println(e1.age);
        System.out.println(e1.surname);
        double twyce = PI * 2;
        System.out.println(twyce);
    }
}
