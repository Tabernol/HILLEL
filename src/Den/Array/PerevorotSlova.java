package Den.Array;

import java.util.Scanner;

public class PerevorotSlova {
    public String perevorot(String s){
        char [] array = new char[s.length()];
        char [] reversArray = new char[s.length()];
        int start=0;
        int end = 0;
        int probel = 0;
        for(int i=0; i<s.length(); i++){
            array[i]= s.charAt(i);
            if(array[i]==' '){
                probel=i;
                end =i-1;
                for(int j=start; j<probel; j++){
                    CharStack.push(array[end]);
                    //System.out.print(array[end]);
                    end--;
                }
                CharStack.push(array[i]);
                //System.out.print(" ");
                start=i+1;
            }
            if(i==s.length()-1){
                int n=0;
                for(int k=i; k>probel; k--){
                    CharStack.push(array[i-n]);
                    //System.out.print(array[i-n]);
                    n++;
                }
            }
        }
       CharStack cs = new CharStack();
        return  cs.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова для переворота:");
        String my = sc.nextLine();
        PerevorotSlova s23 = new PerevorotSlova();
        System.out.println(s23.perevorot(my));
    }
}
