package DevEducation.HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println(multiplayOrPlus(7, 7));
    }
    static int multiplayOrPlus(int a, int b) {
        int result = 0;
        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        return result;
    }
}
