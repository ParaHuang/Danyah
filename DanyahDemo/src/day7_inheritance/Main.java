package day7_inheritance;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
//        h1.kungFu();      //wrong. kungFu belongs to SubClass,therefore SuperClass doesn't have it

        Chinese c1 = new Chinese();
        c1.eat();
        c1.kungFu();

        American a1 = new American();
        a1.eat();
    }
}
