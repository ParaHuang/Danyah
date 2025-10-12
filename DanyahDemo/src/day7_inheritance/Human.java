package day7_inheritance;
/*
encapsulation: safety of code
inheritance: reuse code
 */


//class SubClass extends SuperClass{}
//class ChildClass extends ParentClass{}

//in a file, there is only 1 public class, and it needs be as same name as file
public class Human {
    public void eat(){
        System.out.println("eating----");
    }
}
//based on what we have in Human, Chinese can expand more
class Chinese extends Human{
    public void kungFu(){
        System.out.println("Chinese knows kung fu");
    }
}

class American extends Human{

}