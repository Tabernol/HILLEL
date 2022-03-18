package Prometeus;

public class Prak1Zav3 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int change = array[i];
                    array[i] = array[j];
                    array[j] = change;
                }
            }
        }
    }
}
