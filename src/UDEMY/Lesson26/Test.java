package UDEMY.Lesson26;

public class Test {
    public static void main(String[] args) {
        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }

}
class X{
    static String s ="";
    {s+="A";}
    static
    {s+="B";}
    {s+="C";}
}