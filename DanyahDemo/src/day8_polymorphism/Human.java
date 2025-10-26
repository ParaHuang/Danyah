package day8_polymorphism;

public class Human {
    public void eat(){
        System.out.println("eating----");
    }

    public void sleep(){
        System.out.println("go to bed and sleep");
    }
}

class Chinese extends Human {
    //override:Subclass overwrite the method from Superclass
    //Chinese eat with chopsticks
    @Override
    public void eat() {
        //super:the object of super class
        //super.eat();        //calling the eat method from super class
        System.out.println("Chinese eat with chopsticks");
    }

    public void kungFu(){
        System.out.println("Chinese knows kung fu");
    }
}

class American extends Human {
    @Override
    public void eat() {
        System.out.println("American like burger");
    }
}

class Japanese extends Human{
    @Override
    public void eat() {
        System.out.println("Japanese like sushi");
    }
}

//overload:methods are in the same name but with different parameters