package UDEMY;

public class Lesson2 {
    byte b1 = 12;
    byte b2 = 0B1100;
    byte b3 = 0_14;
    byte b4 = 0XC;

    short s1 = -1300;
    short s2 = 0B11111111111111111111101011101100;
    short s3 = 0_37777775354;
    short s4 = 0XFFFFFAEC;

    int i1 = 0;
    int i2 = 0B0;
    int i3 = 0_0;
    int i4 = 0X0;

    long l1 = 123456789L;
    long l2 = 0B0111010110111100110100010101L;
    long l3 = 0_726746425L;
    long l4 = 0X75BCD15L;

    void les2() {
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
        System.out.println(f1 + " " + f2 + " " + d1 + " " + d2);
        System.out.println(c1 + " " + c2 + " " + c3+" " + bo1+" "+ bo2);
    }

    float f1 = 3.14f;
    float f2 = 0.4567890f;
    double d1 = 12.67890;
    double d2 = -345678.67890;
    boolean bo1 = true;
    boolean bo2 = false;

    char c1 = 'X';
    char c2 = 5678;
    char c3 = '\u45af';
}
