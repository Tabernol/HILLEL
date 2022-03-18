package Den.Array;

import java.util.Scanner;

public class S{
    public void perevorot(String s) {
            char arrayChar[] = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arrayChar[j] = s.charAt(s.length()-1-j);
                System.out.print(arrayChar[j]);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова для переворота и обратного порядка:");
        String my = sc.nextLine();
        S s2 = new S();
        s2.perevorot(my);
    }
}
