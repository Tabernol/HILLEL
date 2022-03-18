package Den.Array;

public class Tack3 {
    public static void main(String[] args) {
        int[][] array = new int[7][4];
        int rezult;
        int rezultMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 4; j++) {
                int p = (int) (Math.random() * 10 - 5);
                array[i][j] = p;
                System.out.print(array[i][j] + ",");
            }
            rezult = array[i][0] * array[i][1] * array[i][2] * array[i][3];
            if (rezult < 0) {
                rezult = rezult * -1;
            }
            if (rezultMax < rezult) {
                rezultMax = rezult;
            }
            System.out.println("произведение строки: " + rezult);
            System.out.println();
        }
        System.out.println("Наибольшее произведение строки: " + rezultMax);
    }
}


