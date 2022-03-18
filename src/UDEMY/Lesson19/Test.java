package UDEMY.Lesson19;

public class Test {
    public void abc(String ... s){
        String [] st = new String [s.length];
        for(int i=0; i<s.length; i++){
            st[i]=s[i];
            System.out.println(s[i]);
        }
    }
    public String myLine(String ... s){
        String [] str = new String[s.length];
        String rez= "";
        for( int i=0; i<s.length; i++){
            str[i]= s[i];
            rez = rez.concat(s[i]);
        }
        return rez;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.abc("ghj", "CVBNM","rtyuio");
        System.out.println(t.myLine("ghjkl","ghjkl;", "TYUIOP"));
    }
}
