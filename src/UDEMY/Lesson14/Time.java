package UDEMY.Lesson14;

public class Time {
    public static void myTime() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute%10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    if(second*hour>minute){
                        continue MIDDLE;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        myTime();
    }
}
