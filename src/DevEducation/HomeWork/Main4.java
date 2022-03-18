package DevEducation.HomeWork;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(whatGrade2(67));
    }
    static String whatGrade2(int rating) {
        String grade;
        if (rating >= 0 & rating <= 19) {
            grade = "F";
        } else if (rating >= 20 & rating <= 39) {
            grade = "E";
        } else if (rating >= 40 & rating <= 59) {
            grade = "D";
        } else if (rating >= 60 & rating <= 74) {
            grade = "C";
        } else if (rating >= 75 & rating <= 89) {
            grade = "B";
        } else if (rating >= 90 & rating <= 100) {
            grade = "A";
        } else grade = "null";
        return grade;
    }
}
