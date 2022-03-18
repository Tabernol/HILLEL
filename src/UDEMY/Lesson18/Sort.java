package UDEMY.Lesson18;

public class Sort {
    public static void main(String[] args) {
        int longArray = (int) (5 + Math.random() * 5);//длина масива от 5 до 10;
        int[] array = new int[longArray];
        int change;
        for (int i = 0; i < longArray; i++) {//Цыкл для заполнения масива
            int a = (int) (Math.random() * 20);
            array[i] = a;
            System.out.print(a + ",");
        }
        for (int i = 0; i < array.length; i++) {//Цыкл на максимальное количество проходов для сортировки
            for (int j = 0; j < array.length - 1; j++) {//Цыкл для сравнивнения значений.
                if (array[j] > array[j+1]) {//Сравнеие
                    change = array[j + 1];// Замена
                    array[j + 1] = array[j];
                    array[j] = change;
                }
            }
        }

        // 1 вариант
        System.out.println();
        for (int number : array) {
            System.out.print(number+" ");
        }
        // 2 вариант
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
