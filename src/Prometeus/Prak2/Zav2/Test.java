package Prometeus.Prak2.Zav2;

public class Test {
    public static void main(String[] args) {
        int[] ar = new int[36];
        for (int i = 0; i < 36; i++) {
            ar[i] = (int) (Math.random() * (36));
            System.out.println(ar[i]);
            for (int j = i; j > 0; j--) {
                if (ar[i] == ar[j - 1]) {
                    System.out.println("vghjk");
                    i--;
                }
            }
        }
        System.out.println();
        int count = 0;

        for(int a: ar){
            System.out.println(count +" "+ a);
            count++;
        }
    }
}