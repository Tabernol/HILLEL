package UDEMY.Lesson16;

public class TestString {

    public String email(String x) {
        String y = new String(x);
        int a = y.indexOf('@');
        int b = y.indexOf('.');
        String k =y.substring(++a,b);
        int a1 = y.indexOf('@',b);
       int b1 = y.indexOf('.',a1);
        String k1 = y.substring(++a1, b1);
        char c ;

        System.out.println(k);

        System.out.println(k1);
        return x;

    }

    public static void main(String[] args) {
        TestString t = new TestString();
        t.email("dfghjk@hjbk.ghj; fgh@hjk.ghj;");

    }
}
