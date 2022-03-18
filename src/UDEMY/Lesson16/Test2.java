package UDEMY.Lesson16;

public class Test2 {
    public String email(String x) {
        String y = new String(x);
        char c;
        int [] array = new int[3];
        int j=0;
        for(int i=0; i<y.length(); i++){
            c=y.charAt(i);
            if(c==';'){
                array[j]=i;
                j++;
            }
        }
        System.out.println(array[1]);
        String s1 = y.substring(0,array[0]);
        String s2 = y.substring(array[0],array[1]);
        System.out.println(s1);
        System.out.println(s2);
        return  x;
    }







    public static void main(String[] args) {
        Test2 t = new Test2();
        t.email("dfghjk@bk.ghj; fgh@k.ghj;");


    }
}
