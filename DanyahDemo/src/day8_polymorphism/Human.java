package day8_polymorphism;

public abstract class Human {
    //1.if a method is important, but the body is not, then you can remove body
    //2.a method without body is abstract
    //3.a class with abstract method is also abstract
    //4.SubClass is forced to override the abstract method from SuperClass (a way to force polymorphism happen)
    //5.if SubClass doesn't want to override the abstract method from SuperClass,then keep making this SubClass as abstract also
    public abstract void eat();

/*
    //eat method is important
    public void eat(){
        System.out.println("eating----");       //but the code inside is useless
    }
*/
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

class Indian extends Human{
    @Override
    public void eat() {
        System.out.println("Indian like curry");
    }
}

abstract class German extends Human{
    //inside German, eat is still abstract
}

//overload:methods are in the same name but with different parameters