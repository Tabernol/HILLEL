package Den.Array;

import java.util.Scanner;

public class String8 {
    public void checkPalindrom(String s) {
        int lgth = s.length();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == ch[s.length() - 1 - i]) {
                check++;
            }
            else {
               break;
            }
        }
        if(s.length()==check){
            System.out.println("Слово палиндром");
        }
        else {
            System.out.println("Слово НЕ палидром");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи слово, а вдруг оно палидром)");
        String str = sc.nextLine();
        String8 s8 = new String8();
        s8.checkPalindrom(str);
    }
}
