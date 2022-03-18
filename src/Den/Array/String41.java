package Den.Array;

import java.util.Scanner;

public class String41 {
    public String permutationWord(String s) {
        String[] array = s.split(" ");
        String[] rez = new String[array.length];
        for (int i=0; i< array.length; i++){
            rez[i]=array[array.length-1-i];
        }
        String rezult = String.join(" ",rez);
        return rezult;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова для переворота и расположения в обратном порядке:");
        String s1 = sc.nextLine();
        String2 s2 = new String2();
        String41 s41 = new String41();
        System.out.println(s2.coupWord(s41.permutationWord(s1)));


    }
}
