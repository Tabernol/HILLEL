package Den.Array;

import java.util.Scanner;

public class Diagonal2 {
    public void checkUpDiagonal() {
        Scanner size = new Scanner(System.in);
        System.out.println("Ведите размер квадраного масива:");
        Scanner s = new Scanner(System.in);

        int n = size.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Введите значение:");
                array[i][j] = s.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        OUTER: for (int i = 1; i < n; i++) {
            INNER: for (int j = i; j <= i; j++) {
                //if (i == n - 1) {
               //    break;
               // }
                if (array[i][j] < array[i -1][j -1]) {
                    System.out.println("елементи главной диагональ не упорядоченьі по возрастанию начиная с индекса: " + (i+-1) + ":" + (j+-1));
                    break OUTER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Diagonal2 array1 = new Diagonal2();
        array1.checkUpDiagonal();
    }
}
