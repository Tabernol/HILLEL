package Prometeus;

public class Prak1Zav5 {
    public static void main(String[] args) {
        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;
        // for (int i = 0; i < data.length; i++) {
        //     if (numberToFind == data[i]) {
        //         System.out.println("Число " + numberToFind + " Знаходиться в массиві на " + i + " індексу");
        //     }
        // }
        int low = 0;
        int hight = data.length - 1;
        int index = -1;
        while (low <= hight) {
            int middle = (low + hight) / 2;
            if (data[middle] < numberToFind) {
                low = middle + 1;
            } else if (data[middle] > numberToFind) {
                hight = middle - 1;
            } else if (data[middle] == numberToFind) {
                index = middle;
                break;
            }
        }
        System.out.println("Число " + numberToFind + " Знаходиться в массиві на " + index + " індексу");

    }
}
