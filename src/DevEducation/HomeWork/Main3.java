package DevEducation.HomeWork;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(whatGrade3(19));
    }
    static String whatGrade3(int rating) {
        int numberCase = 0;
        String grade = "";
        int[] array = new int[]{0, 19, 39, 59, 74, 89, 100};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < rating) {
                numberCase++;
            }
        }
        switch (numberCase) {
            case 0:
                return "null";
            case 1:
                return "F";
            case 2:
                return "E";
            case 3:
                return "D";
            case 4:
                return "C";
            case 5:
                return "B";
            case 6:
                return "A";
            default:
                System.out.println("null");
                break;
        }
        return grade;
    }
}