package Den.Array;

import java.util.Scanner;

public class String2 {
    public String coupWord(String s) {
        char[] array = new char[s.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }
        char[] arrayAfterCoupWord = new char[s.length()+1];
        int k=0;
        OUTER:
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                INNER:
                for (int j = i - 1; j >= 0; j--) {
                    arrayAfterCoupWord[k]=array[j];
                    //System.out.print(array[j]);
                    k++;
                    if (array[j] == ' ') {
                        continue OUTER;
                    }
                }
                arrayAfterCoupWord[k]=' ';
                //System.out.print(" ");
                k++;
            }
            if (i == array.length - 1) {
                for (int j = i; j >= 0; j--) {
                    arrayAfterCoupWord[k]=array[j];
                    //System.out.print(array[j]);
                    k++;
                    if (array[j] == ' ') {
                        break;
                    }
                }
            }
        }
        String rez = new String(arrayAfterCoupWord);
        String rezult = rez.trim();
        return rezult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова для переворота и прямого порядка:");
        String my = sc.nextLine();
        String2 s2 = new String2();
        System.out.println(s2.coupWord(my));
    }
}
