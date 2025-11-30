package day11;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
//        1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//        Jhon, Jack, Alex, Helan, Cecilia, Mia,Sonia, Tomas, Tyler, Chris.
//        Now you need to choose 5 of them randomly to attend your party.
//        Try to create a program to make it come true, in the end, output your guests' name one by one.
        String[] arr = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia", "Sonia", "Tomas", "Tyler", "Chris"};
        Random random = new Random();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for(int i=0 ; i<5 ; i++){   //i controls loop happens 5 times
            int index = random.nextInt(list.size());   //0~the last index of list
            String chosen = list.remove(index);
            System.out.println(chosen);
        }

    }
}
