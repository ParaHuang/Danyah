package day8_polymorphism;

public class Main2 {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        American american = new American();
        Japanese japanese = new Japanese();

        Club club = new Club();
        club.party(chinese);
        club.party(american);
        club.party(japanese);
    }
}
