package UDEMY.Lesson17;

public class Test {
    public static boolean ravenstvo(StringBuilder x1, StringBuilder x2) {
        boolean rezult = false;
        //rezult = x1 == x2;
        rezult = x1.equals(x2);
        return rezult;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb3 = sb1;
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb1, sb2));
    }
}