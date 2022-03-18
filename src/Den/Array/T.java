package Den.Array;

public class T {
    public static int randomIndex() {
        int random = (int) (Math.random() * (10));
        return random;
    }

    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] =(int) (Math.random() * (10));
            System.out.println(ar[i]);
            for (int j = i; j > 0; j--) {
                if (ar[i] == ar[j - 1]) {
                    System.out.println("vghjk");
                    i--;
                }
            }
        }
        System.out.println();
        for (int f : ar) {
            System.out.print(f);
            int $const_goto = 3;
       }
    }
}
