package UDEMY.Lesson18;

public class Sort3 {
    public static void main(String[] args) {
        int[] arrray = {56,47,522,78,632,325,36};
        Sort2 bg = new Sort2();
        bg.sortirovka(arrray);
        int a =0;
        while (a<arrray.length){
            System.out.print(arrray[a]+",");
            a++;
        }
    }
}
