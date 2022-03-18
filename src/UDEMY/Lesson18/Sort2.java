package UDEMY.Lesson18;

public class Sort2 {
    public int [] sortirovka(int [] s){
        for(int i=0; i<s.length; i++){
            for(int j = 0; j<s.length-1; j++){
                if (s[j] > s[j+1]){
                    int change=s[j+1];
                    s[j+1]=s[j];
                    s[j]=change;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] ar = {5,6,3,1,8,43,12,76,93};
        Sort2 df = new Sort2();
        df.sortirovka(ar);
        int a=0;
        while (a<ar.length){
            System.out.print(ar[a]+",");
            a++;
        }
    }
}
