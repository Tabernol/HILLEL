package Den.Array;

import java.util.Scanner;

public class String4 {
    public String reversString(String s){
        char array [] = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            array[i]=s.charAt(s.length()-i-1);
        }
        String reversS = new String(array);
        return reversS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова для переворота и расположения в обратном порядке:");
        String s1 = sc.nextLine();
        String4 s2 = new String4();
        System.out.println(s2.reversString(s1));
    }
}
