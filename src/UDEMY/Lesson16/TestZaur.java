package UDEMY.Lesson16;

public class TestZaur {
    int a = 0;
    int b = 0;
    int c = 0;

    public void email(String x) {
        while (c < x.length()) {
            a = x.indexOf('@', c);
            b = x.indexOf('.', c);
            c = x.indexOf(';', ++c);
            String y = x.substring(++a, b);
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
        TestZaur tz = new TestZaur();
        tz.email("ya@yahoo.com; on@gmail.com; ona@mail.ro;");
    }
}
