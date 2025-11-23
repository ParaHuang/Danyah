package day9;

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


//noun
abstract class GameMachine{
    //verb,action
    public abstract void playGame();
}

class PS5 extends GameMachine{

    @Override
    public void playGame() {
        System.out.println("PS5--buy a game CD，connect with TV，there we go!");
    }
}

class Nintendo extends GameMachine{

    @Override
    public void playGame() {
        System.out.println("Nintendo--turn it on，choose a game，playing alone，so nice");
    }
}

class XBox extends GameMachine{

    @Override
    public void playGame() {
        System.out.println("XBox--connect with TV,choose a game from game store, then play");
    }
}

abstract class Camera {
    public abstract void takePicture();
}

class Polaroid extends Camera{

    @Override
    public void takePicture() {
        System.out.println("press the shutter, get an instant photo");
    }

}

class GoPro extends Camera {

    @Override
    public void takePicture() {
        System.out.println("diving into ocean,let's memorize this beautiful world");
    }
}

class DigiCam extends Camera {

    @Override
    public void takePicture() {
        System.out.println("press the shutter,get an digital picture");
    }
}

//single extends
class A{}
class B{}
class C extends B{}