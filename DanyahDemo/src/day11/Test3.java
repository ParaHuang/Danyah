package day11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
//        1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//        Jhon, Jack, Alex, Helan, Cecilia, Mia,Sonia, Tomas, Tyler, Chris.
//        Now you need to choose 5 of them randomly to attend your party.
//        Try to create a program to make it come true, in the end, output your guests' name one by one.
        String[] arr = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia", "Sonia", "Tomas", "Tyler", "Chris"};
        Random random = new Random();

        Set<String> names = new HashSet<>();
        while(names.size()<5) {
            int index = random.nextInt(10);      //range:0~9
            System.out.println(arr[index]);
            names.add(arr[index]);
        }
        System.out.println(names);


    }
}
