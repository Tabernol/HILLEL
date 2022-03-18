package Den.Array;

public class String52 {
    public String sortAlphabet(String s) {
        String s1 = s.trim();
        String[] array = s1.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                char c1 = array[j].charAt(0);
                char c2 = array[j + 1].charAt(0);
                if (c1 > c2) {
                    String change = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = change;
                }

            }
        }
        String rezult = String.join(" ", array);
        return rezult;
    }

    public static void main(String[] args) {
        String s52 = " ASDF GHJ xm vbn tyui zxc YUI vbnm df cv mv ABS xa a c v b d f i k l " ;
        String52 str52 = new String52();
        System.out.println(str52.sortAlphabet(s52));
    }
}
