package UDEMY.Lesson16;

public class Test1 {
    public String email(String x) {
        String y = new String(x);
        char c;
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int j=0, k =0;
        for(int i=0; i<y.length(); i++){
            c=y.charAt(i);
            if(c=='@'){
                array1[j]=++i;
                j++;
            }
            if (c=='.'){
                array2[k]=i;
                k++;
            }
        }
        int n=0; j=0; k=0;
        while(n<=j){
            String s = y.substring(array1[j], array2[k]);
            System.out.println(s);
            n++; j++;k++;
        }
        return x;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.email("dfghjk@bk.ghj; fgh@hjk.ghj; ghj@bnml.hjk vbn@zaq.zaq");
    }
}
