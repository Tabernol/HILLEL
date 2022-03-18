package Den.Array;

import java.util.Scanner;

public class String3 {
    public String cutSomeStrig(String s) {
        System.out.println("Введите с какого индекса удалить часть строки");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("какой длині удалить строку:");
        int lgth = sc.nextInt();
        //String result = s.substring(start,start+lgth);
        String result = s.substring(0,start)+s.substring(start+lgth,s.length());
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Ведите строку");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String3 st = new String3();
        System.out.println(st.cutSomeStrig(s1));
    }
}
