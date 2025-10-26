package day8_polymorphism;

public class Club {

    public void party(Human h){
        System.out.println();
        System.out.println("party start");
        //human come to party to eat
        h.eat();    //polymorphism.because every subclass override eat
        System.out.println("party is over, go home");
        //sleep
        h.sleep();  //no polymorphism.
    }
}
