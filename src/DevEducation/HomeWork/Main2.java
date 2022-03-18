package DevEducation.HomeWork;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(whatGrade1(69));
    }
    static String whatGrade1(int rating) {
        String grade = "";
        int n;
        if (rating >= 70 & rating <= 74||rating>100) {
            n = 1;
        } else {
            n = 10;
        }
        switch (rating / n) {
            case 0:
            case 1:
                return "F";
            case 2:
            case 3:
                return "E";

            case 4:
            case 5:
                return "D";
            case 6:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                return "C";
            case 7:
            case 8:
                return "B";
            case 9:
            case 10:
                return "A";
            default:
                System.out.println("null");
                break;
        }
        return grade;
    }
}
