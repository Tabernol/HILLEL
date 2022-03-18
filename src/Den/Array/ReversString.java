package Den.Array;

public class ReversString {
    public static void main(String[] args) {
        String s = "one two three";
        int leng = s.length();
        char [] array1 = new char[leng];
        char [] array2 = new char [leng];

        for (int i=0; i <leng; i++){
            array1[i]= s.charAt(i);
        }
        for (int i =0; i<leng; i++){
            array2[i] = array1[(leng-1)-i];
        }
        String reversS = new String(array2);
        System.out.println(reversS);
    }
}
