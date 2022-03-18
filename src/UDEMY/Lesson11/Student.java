package UDEMY.Lesson11;

import java.util.Objects;

public class Student {
    public String name;
    public int course;
    public double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }


    public static void srav2(Student s1, Student s2){
        if(s1.equals(s2)){
            System.out.println("The same");
        }
        else {
            System.out.println("NOT the same");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, grade);
    }
}

class StudentTest1 {
    public static void main(String[] args) {
        Student st1 = new Student("A", 1, 4);
        Student st2 = new Student("A", 1, 4);
        Student st3 = new Student("Alex", 3, 9);

        System.out.println(st1.name + " " + st1.course + " " + st1.grade);
        System.out.println(st2.name + " " + st2.course + " " + st2.grade);
        //Student.srav(st1, st3);
        //Student.srav1(st1, st2);
        Student.srav2(st1, st2);
    }
}