package UDEMY.Lesson8;

public class Lesson8 {
    static int multiplicationABC(int a, int b, int c){
        int result = a * b * c;
        return result;
    }
    static void divide(int a1, int b1){
        System.out.println("Результат деления А/В " + (a1/b1));
        System.out.println("Остаток от деления А/В "+ (a1%b1));
    }
}
class Test{
    public static void main(String[] args){
        System.out.println(Lesson8.multiplicationABC(4,5,10));
        Lesson8.divide(13,2);
        System.out.println(Lesson8.multiplicationABC(10,12,14));
        Lesson8.divide(5,3);
    }
}
