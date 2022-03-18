package UDEMY.Lesson7;

public class Emploee {
    double salary;
    public String surname;
    int id;

    public void m1() {
        System.out.println(salary);
    }

    public void m2() {
        System.out.println(surname);
    }

    public void m3() {
        System.out.println(id);
    }

    Emploee(int id1) {
        id = id1;
    }

    public Emploee(String surname2) {
        surname = surname2;
    }

    private Emploee(double salary1) {
        salary= salary1;
    }
    public static void main(String[] args) {
        Emploee emp1 = new Emploee(100.5);
        Emploee emp2 = new Emploee("Alex");
        Emploee emp3 = new Emploee(12);
        System.out.println(emp1.salary );
        System.out.println(emp2.surname );
        System.out.println(emp3.id);
        emp1.m1();
        emp2.m2();
        emp3.m3();
    }
}

class EmploeeTest {
    public static void main(String[] args) {
        //Emploee emp1 = new Emploee(100.5);
        Emploee emp2 = new Emploee("Alex");
        Emploee emp3 = new Emploee(12);
        //System.out.println(emp1.salary );
        System.out.println(emp2.surname );
        System.out.println(emp3.id);
        //emp1.m1();
        emp2.m2();
        emp3.m3();
    }
}

