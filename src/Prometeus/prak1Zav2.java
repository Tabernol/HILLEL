package Prometeus;

public class prak1Zav2 {
    public static void main(String[] args) {
        int iteration = 1;
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j + i == size - 1 | i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(iteration + " ");
                }
                iteration++;
            }
            System.out.println();
        }
    }
}
