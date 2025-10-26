package day8_polymorphism;

public class Main {
    public static void main(String[] args) {
        //create an object
        //1.initialize
        //ClassName instance = new ClassName();
        //2.reference type change
        //SuperClass reference = new SubClass();

        /*
        Human h1 = new Human();
        h1.eat();
        System.out.println();

        Chinese c1 = new Chinese();
        c1.eat();
        c1.kungFu();
        System.out.println();

        American a1 = new American();
        a1.eat();
        */
//      reference      object
        Human h1 = new Chinese();
        h1.eat();       //how to call the method depends on the type of object
//        h1.kungFu();  //wrong, what methods we can call depends on the type of reference

        Human h2 = new American();
        h2.eat();
    }
}

//1.override
//2.reference type change
//      what we can call depends on reference
//      how we call depends on object

//polymorphism: 1 things shows in different way
//     =  reference type change  +  override