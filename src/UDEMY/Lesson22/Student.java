package UDEMY.Lesson22;

public class Student {
    //Student(StringBuilder name, int course, int grade){
    /////    this.name = name;
     //   this.course = course;
   //     this.grade = grade;
   // }
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 2) {
            this.name = name;
        }
        else System.out.println("name is short");

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c > 0 & c < 5) {
            course = c;
        }
        else course = -1;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if(g>0 & g<11) {
            grade = g;
        }
        else grade= -1;
    }
    public void showInfo(){
        System.out.println("Name "+getName());
        System.out.println("Course "+ getCourse());
        System.out.println("Grade "+ getGrade());
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName(new StringBuilder("Va"));
        s1.setCourse(6);
        s1.setGrade(-3);
        s1.showInfo();
    }
}
