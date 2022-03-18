package UDEMY.Lesson24;

public class Test2 {
    public static void main(String[] args) {
Mechenosec m = new Mechenosec("ryba");
//m.eat();
//m.swim();
//m.sleep();
Speakable sp = new Pinguin("ptica", "vasis");
sp.speak();
//        ((Pinguin)sp).eat();
//        ((Pinguin)sp).fly();
//        ((Pinguin)sp).sleep();

        Animal a = new Lev("animal", "leava");
        a.eat();
        a.sleep();
        ((Lev)a).run();
    }


}
