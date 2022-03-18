package UDEMY;

public class StudentLesson6 {
    int id;
    String name;
    String surname;
    int kurs;
    double mathmeticAvrGrade;
    double economyAvrGrade;
    double foreignLanguageAvrGrade;

    StudentLesson6(int id1, String name1, String surname1, int kurs1, double mathmeticAvrGrade1, double economyAvrGrade1, double foreignLanguageAvrGrade1){
        id=id1;
        name = name1;
        surname = surname1;
        kurs = kurs1;
        mathmeticAvrGrade = mathmeticAvrGrade1;
        economyAvrGrade = economyAvrGrade1;
        foreignLanguageAvrGrade = foreignLanguageAvrGrade1;
    }
    StudentLesson6(int id, String name, String surname, int kurs){
        this(id,name, surname, kurs, 0, 0,0 );
    }
    StudentLesson6(){
        this(0, null, null, 0, 0,0,0 );
    }
}
