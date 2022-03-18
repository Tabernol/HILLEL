package UDEMY.Lesson22;

public class Pet extends Animal {
    public Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;
    public void run (){
        System.out.println("Pet runs");
    }
    public void jump (){
        System.out.println("Pet jumps");
    }
}
