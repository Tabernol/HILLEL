package Den.Array;

import java.util.Scanner;

public class String6 {
    String[] stack = new String[10];//создание стека
    int tos = 0; //индексация стека

    public String[] makeArrayFromLIne(String s) {//Создание масива стринг из строки
        String s1 = s.trim();
        String[] array = s1.split(" ");
        return array;
    }

    public void push(String st) {//Заталкивание в Стек
        if (tos >= stack.length) {
            String[] array = new String[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                array[i] = stack[i];
            }
            stack=array;
        }
        stack[tos] = st;
        tos++;
    }

    public void pushUniqueWord(String[] sArray) {
        for (int i = 0; i < sArray.length; i++) {//цикл прохождения по масиву
            char[] ch = new char[sArray[i].length()];
            for (int j = 0; j < sArray[i].length(); j++) {// цикл для перевода слова в массив char
                ch[j] = sArray[i].charAt(j);
            }
            String6 word = new String6();
            if (word.checkletterWord(ch) != null) {//проверка на уникальность слова
                push(word.checkletterWord(ch));//если оноуникально заталкивает в массив
            }
        }
    }

    public void checkStack() {
        if (stack[0] == null) {//провека масива и перезапуск
            System.out.println("Введите слово или слова еще раз");
            String6 s6 = new String6();
            s6.checkLongAndShort(stack);//метод находит короткое и длиное уникальное слово и принтует
        }
        if (stack[1] != null) {//если два или больше слов в стеке
            String6 s6 = new String6();
            s6.checkLongAndShort(stack);//метод находит короткое и длиное уникальное слово и принтует
        } else {
            System.out.println("Слово с не повторяющимися символами " + stack[0]); // если слово всего одно
        }
    }

    public String checkletterWord(char[] c) {//Метод проверяет наличие одинаковіх символов и возвращает строку если єто так
        boolean check = true;
        String rezult = null;
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    //System.out.println("LR");
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            rezult = new String(c);
        }
        return rezult;
    }

    public void checkLongAndShort(String[] str) {//метод находит короткое и длиное уникальное слово и принтует
        int i = 0;
        int indexMaximalLegth = i;
        int indexMinLegth = i;
        for (i = 0; i < str.length - 1; i++) {
            if (str[i + 1] != null) {
                if (str[i].length() > str[i + 1].length()) {
                    indexMinLegth = i + 1;
                }
                if (str[i].length() < str[i + 1].length()) {
                    indexMaximalLegth = i + 1;
                }
            }
        }
        System.out.println("Самое длиное слово с не повторяющимеся символами " + str[indexMaximalLegth]);
        System.out.println("Самое короткое слово с не повторяющимеся символами " + str[indexMinLegth]);
    }

    public static void main(String[] args) {
        System.out.println("Введите слово или слова для нахождения слова с не повторяющимеся символами");
        Scanner scanner = new Scanner(System.in);
        String s6 = scanner.nextLine();
        String6 str6 = new String6();
        str6.pushUniqueWord(str6.makeArrayFromLIne(s6));
        str6.checkStack();
    }
}
