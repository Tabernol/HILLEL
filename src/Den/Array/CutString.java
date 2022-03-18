package Den.Array;

import java.util.Scanner;
public class CutString {
public void cutOut(String s, int p, int q){
    char [] array = new char[s.length()];
    for(int i=0; i<s.length(); i++){
        array[i]=s.charAt(i);
    }
    String cut = s.substring(p,p+q);
    String afterCut=s.replace(cut,"");
    System.out.println(afterCut);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s1 = sc.nextLine();
        System.out.println("Введите с какой позиции удалить символи:");
        int pozition = sc.nextInt();
        System.out.println("Ведите сколько символов удалить:");
        int quantity = sc.nextInt();
        CutString my1 = new CutString();
        my1.cutOut(s1,pozition,quantity);
    }
}
