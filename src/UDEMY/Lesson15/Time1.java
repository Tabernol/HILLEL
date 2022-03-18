package UDEMY.Lesson15;

public class Time1 {
    public static void myTime() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                int second = 0;
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            }
            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        myTime();
    }
}
