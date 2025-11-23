package day10;

public class Main {
    public static void main(String[] args) {
        PS5 ps5 = new PS5();    //only 1 ps5
        Nintendo nintendo = new Nintendo();
        XBox xBox = new XBox();

        YoungPeople people = new YoungPeople();
        people.haveFun(ps5);
        people.haveFun(nintendo);
        people.haveFun(xBox);
        people.haveFun(ps5);

        Polaroid polaroid = new Polaroid();
        DigiCam digicam = new DigiCam();
        GoPro goPro = new GoPro();

        people.goodMoments(polaroid);
        people.goodMoments(digicam);
        people.goodMoments(goPro);

        System.out.println("-------------");
        TelePhone telePhone = new TelePhone();
        people.haveFun(telePhone);
        people.goodMoments(telePhone);
    }
}

class YoungPeople{
    public void haveFun(GameMachine machine){
        //use game machine to play games
//        objectOfGameMachine.playGame();
        System.out.println("\nyoung people start to have fun");
        machine.playGame();
    }
    public void goodMoments(Camera camera){
        System.out.println("\nrecord moments");
        camera.takePicture();
    }
}


//abstract class = abstract methods + normal methods
//1.inside an abstract class, there are only abstract method, then make this abstract class into interface
//2.every method is abstract inside interface, no need to write abstract modifier
//3.we define class to  implements interface,this class is forced to override all abstract methods from interface
interface GameMachine{
    //verb,action
    void playGame();
}

class PS5 implements GameMachine{

    @Override
    public void playGame() {
        System.out.println("PS5--buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo implements GameMachine{

    @Override
    public void playGame() {
        System.out.println("Nintendo--turn it on，choose a game，playing alone，so nice");
    }
}

class XBox implements GameMachine{

    @Override
    public void playGame() {
        System.out.println("XBox--connect with TV,choose a game from game store, then play");
    }
}

interface Camera {
    void takePicture();
}

class Polaroid implements Camera{

    @Override
    public void takePicture() {
        System.out.println("press the shutter, get an instant photo");
    }

}

class GoPro implements Camera {

    @Override
    public void takePicture() {
        System.out.println("diving into ocean,let's memorize this beautiful world");
    }
}

class DigiCam implements Camera {

    @Override
    public void takePicture() {
        System.out.println("press the shutter,get an digital picture");
    }
}

class TelePhone implements Camera,GameMachine{

    @Override
    public void takePicture() {
        System.out.println("take my phone out, take a picture that I can watch it everyday");
    }

    @Override
    public void playGame() {
        System.out.println("take my phone out, login, play some online games with my teammates");
    }
}

//single extends
class A{}
class B{}
class C extends B{}

//multiple implements
interface D{}
interface E{}
interface F{}
class G implements D,E,F{}

class H extends A implements D,E,F{}

