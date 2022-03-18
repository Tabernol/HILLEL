package UDEMY;

public class Main {
    public static void main(String[] args){
        Lesson2 obj = new Lesson2();
        obj.les2();
        Lessons3 obj3 = new Lessons3();
        obj3.les3();
        Leson4 st3 = new Leson4(3, "Petr", "Afanasii", 2,4,5,9);
        st3.les4();
        Leson4 st1 = new Leson4(1, "Ivan", "Petrov", 3, 7, 4, 9);
        st1.les4();
        Leson4 st2 = new Leson4(2, "Vasil", "Fedorov", 4, 5,5,6);
        st2.les4();

        st3.les5(st3);
        st1.les5(st1);

        Lesson6 objSum = new Lesson6();
        System.out.println(objSum.summa(3,4,5,6));
        System.out.println(objSum.summa(1));

        StudentLesson6 student1 = new StudentLesson6();
        System.out.println(student1.id+" " +student1.name+" "+ student1.surname+" "+ student1.kurs+" " + student1.mathmeticAvrGrade+" "+ student1.economyAvrGrade+" "+ student1.foreignLanguageAvrGrade);
        StudentLesson6 student2 = new StudentLesson6(12, "Alex", "Smith", 4);
        System.out.println(student2.id+" " +student2.name+" "+ student2.surname+" "+ student2.kurs+" " + student2.mathmeticAvrGrade+" "+ student2.economyAvrGrade+" "+ student2.foreignLanguageAvrGrade);
        StudentLesson6 student3 = new StudentLesson6(13, "Doctor", "Java", 5, 6,3,9);
        System.out.println(student3.id+" " +student3.name+" "+ student3.surname+" "+ student3.kurs+" " + student3.mathmeticAvrGrade+" "+ student3.economyAvrGrade+" "+ student3.foreignLanguageAvrGrade);
        StudentLesson6 student4 = new StudentLesson6(14, "Max", null, 3, 5, 0,3);
        System.out.println(student4.id+" " +student4.name+" "+ student4.surname+" "+ student4.kurs+" " + student4.mathmeticAvrGrade+" "+ student4.economyAvrGrade+" "+ student4.foreignLanguageAvrGrade);
        StudentLesson6 student5 = new StudentLesson6();
        System.out.println(student5.id+" " +student5.name+" "+ student5.surname+" "+ student5.kurs+" " + student5.mathmeticAvrGrade+" "+ student5.economyAvrGrade+" "+ student5.foreignLanguageAvrGrade);

    }
}
