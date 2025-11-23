package day10;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        //generic: data restriction
        List<String> list = new ArrayList<>();
        //1.add
        //add in the end
        list.add("hello");
        list.add("hey");
        //add at an index:   0~size
        list.add(2,"hi");
        System.out.println(list);

        //2.get value by index
//        String e1 = list.get(0);
//        System.out.println(e1);
//        for(int i=0 ; i<list.size() ; i++){
//            System.out.println(list.get(i));
//        }
        //foreach loop , enhanced for loop
//        for(String x:list){
//            System.out.println(x);
//        }

        //3.remove
        //directly remove the value,return value is tell that if you removed value successfully
//        boolean result = list.remove("hello");
//        System.out.println(result);
        //remove by index,return the value you just removed
//        String removedValue = list.remove(0);
//        System.out.println(removedValue);

        //4.set
        list.set(0,"HELLO");
        System.out.println(list);
    }
}
