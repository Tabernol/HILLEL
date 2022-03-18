package UDEMY.Lesson18;

public class Show {
    public void showArray(String [] [] s){
        System.out.print("{");
        for(int i = 0; i<s.length; i++){
            System.out.print("{");
            for(int j=0; j<s[i].length; j++){
                if(j==s[i].length-1){
                    System.out.print(s[i][j]);
                }
                else {
                    System.out.print(s[i][j]+",");
                }
            }
            if(i==s.length-1){
                System.out.print("}");
            }
            else {
                System.out.print("},");
            }
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        String [][] s1 = new String[3][];
        s1 = new String[][]{{"how", "i can", "hjk","ghjk"}, {"do"}, {"this", "Task"},{"bnm"}};
        Show sh = new Show();
        sh.showArray(s1);

    }
}
