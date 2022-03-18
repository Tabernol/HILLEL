package Den.Array;

import java.util.Scanner;

public class String11 {
    public void howManySimbol(String s) {
        int lght = s.length();
        char[] array = new char[lght];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }
        OUTER:
        for (int i = 0; i < array.length; i++) {//цикл для прохождения всей строки
            int count = 1;
            INNER:
            for (int k = 0; k < i; k++) {// цикл для вихода если встречается одинаковій символ
                if (array[i] == array[k]) {
                    continue OUTER;
                }
            }
            INNER2:
            for (int j = i; j < array.length - 1; j++) {// цикл для подсчета количества символов
                if (array[i] == array[j + 1]) {
                    count++;
                }
            }
            System.out.println("Символ: '" + array[i] + "' встречается " + count + " раз");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько раз каждій символ встречается");
        String s1 = new String(sc.nextLine());
        String11 obj = new String11();
        obj.howManySimbol(s1);
    }
}
