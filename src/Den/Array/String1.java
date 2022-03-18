package Den.Array;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово на подсчет символа 'k' ");
        String s = sc.next();
        int count=0;
        char [] c = new char[s.length()];
        for(int i =0; i<s.length(); i++){
            c[i]= s.charAt(i);
        }
       for (int i =0; i<c.length; i++){
           if(c[i]=='k'){
               count++;
           }
       }
        System.out.println("символов k :" + count);
    }
}
