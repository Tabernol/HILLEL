package UDEMY.Lesson24;

public class Test {
}
abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name) {
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Vsegda interesno smotret kak spyat rybi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(Bird.this+"sings");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable {
    default void speak (){
        System.out.println("Some body speak");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Mechenocic krasivaia ryba, kotoroya bystro plavaet");
    }
    public void eat(){
        System.out.println("mechenocec ne hichnay ryba");}
}
class Pinguin extends Bird{
    Pinguin(String name, String pName){
        super("vano");

    }

    @Override
    void fly() {
        System.out.println("pinguin ne ymeet letat");
    }

    @Override
    void eat() {
        System.out.println("pinguin lubit est rybu");
    }

    @Override
    void sleep() {
        System.out.println("pinguin spyat privaliv k drugu");
    }
    public void speak(){
        System.out.println("Pinguin ne umeet pet kak solovei");
    }
}
class Lev extends Animal{
    Lev(String name, String levName){
        super("Animal");
    }

    @Override
    void eat() {
        System.out.println("Lev lubit myaso");
    }

    @Override
    void sleep() {
        System.out.println("lev mnogo spit");
    }
    public void run(){
        System.out.println("Lev ne samay bistray koshka");
    }
}

