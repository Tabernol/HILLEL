package UDEMY.Lesson9;

import java.sql.SQLOutput;

public class Objeckt8 {
int a;

        Objeckt8( int a){
            a *= 2;
            this.a = a;
        }


    public static void main(String[] args) {
        Objeckt8 o1 = new Objeckt8(2);
        Objeckt8 o2 = new Objeckt8(23);
        Objeckt8 o3 = new Objeckt8(5);
        Objeckt8 o4 = new Objeckt8(6);
        Objeckt8 o5 = new Objeckt8(7);
        Objeckt8 o6 = new Objeckt8(4);
        Objeckt8 o7 = new Objeckt8(9);
        Objeckt8 o8 = new Objeckt8(21);
        o1=null;
        o2=o3;
        o3=o4;
        o4=null;
        o5=null;
        o6=o7=null;
       // System.out.println(o1.a);
        System.out.println(o2.a);
        System.out.println(o3.a);
        System.out.println(o4.a);
        //System.out.println(o5.a);
        //System.out.println(o6.a);
        //System.out.println(o7.a);
        System.out.println(o8.a);
    }
}
