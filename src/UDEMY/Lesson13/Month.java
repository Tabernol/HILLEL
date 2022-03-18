package UDEMY.Lesson13;

public class Month {
    int month = 1;

    public static void amountDayMonth(int month) {
        switch (month) {
            case 2:
                System.out.println("28");
                break;
            case 3:
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
class Op{
    public static void main(String[] args) {
        Month.amountDayMonth(11);
    }
}



