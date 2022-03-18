package Den.Array;

public class String51 {
    public String lgthWords(String s) {
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String change = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = change;
                }
            }
        }
        String rezult = String.join(" ", array);
        return rezult;
    }
        public static void main (String[]args){
            String s5 = "one op asdf hundred bnm hjkl wertyuiop nm bn n nmqwertyuio fgjk";
            String51 s51 = new String51();
            System.out.println(s51.lgthWords(s5));
        }
    }
