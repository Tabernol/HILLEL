package Den.Array;

import java.util.Scanner;

public class String7 {
   private static String[] steck = new String[10];
   private static int tos = 0;
   private boolean b = true;

    private void push(String s) {///Почему тут без static не віходіло
        if (tos >= steck.length) {
            String[] array = new String[steck.length * 2];
            for (int i = 0; i < steck.length; i++) {
                array[i] = steck[i];
            }
            steck = array;
        }
        steck[tos] = s;
        tos++;
    }

    private void receptionWord() {
        while (b) {
            System.out.println("Вводи слова и предложения для их случайной расстановки, для окончания ввода введите 'EXIT' ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("EXIT")) {
                b = false;
            } else {
                push(str);
            }
        }
    }

    private int randomIndex() {
        int random = (int) (Math.random() * (tos));//метод возвращает случайний индекс из заданой длини
        return random;
    }

    private int[] mixIndex() {
        int[] randomArray = new int[tos];
        for (int i = 0; i < randomArray.length; i++) {//цикл заполнения индесами
            randomArray[i] = randomIndex();//присвоение случайних значений, что б потом стали индексами
            for (int j = i; j > 0; j--) {//цикл для проверки не повторяемости индексов
                if (randomArray[i] == randomArray[j - 1]) {
                    i--;
                }
            }
        }
        return randomArray;
    }

    public void abrakadabra() {
        String result = "";
        int[] randomArray = mixIndex();
        for (int i = 0; i < tos; i++) {
            String s = steck[randomArray[i]];
            result = result.concat(s + " ");
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        String7 objeckt = new String7();
        objeckt.receptionWord();
        objeckt.abrakadabra();
    }
}
