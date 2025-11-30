package day11;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //enter 10 numbers, only 1 unique values
        //if there are duplicate, only keep the first one
        //List/Set

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<10 ; i++){
            System.out.print("enter an integer number:");
            int num = scanner.nextInt();
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);

        /*
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<10 ; i++){
            System.out.print("enter an integer number:");
            int num = scanner.nextInt();
            set.add(num);
        }
        System.out.println(set);
         */
    }
}
