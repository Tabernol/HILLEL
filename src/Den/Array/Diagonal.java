package Den.Array;
import java.util.Scanner;
public class Diagonal {
    public void checkSumDiagonal() {
        Scanner size = new Scanner(System.in);
        System.out.println("Ведите размер квадраного масива:");
        Scanner s = new Scanner(System.in);

        int n = size.nextInt();
        int m = n;
        int summa = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Введите значение:");
                array[i][j] = s.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                summa += array[i][j];
            }
        }
        if(summa<100){
            System.out.println("Сумма главной диагонали меньше 100 и равна:"+ summa);
        }
        else{
            System.out.println("Сумма главной диагонали больше 100 и равна:"+ summa);
        }
    }
    public static void main(String[] args) {
        Diagonal array1 = new Diagonal();
        array1.checkSumDiagonal();
    }
}
