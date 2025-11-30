package day11;

import java.util.*;

//Collection
//      |-------List(ArrayList,LinkedList)
//      |-------Set(HashSet)

//Collections: the tool of Collection
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hey");
        list.add("hi");
        list.add("hello");
        list.add("hey");
        list.add("hi");
        list.add("hello");
        list.add("hey");
        list.add("hi");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));

        //1.can't save duplicate value
        //2.there is no index
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hey");
        set.add("hi");
        set.add("hello");
        set.add("hey");
        set.add("hi");
        set.add("hello");
        set.add("hey");
        set.add("hi");
        System.out.println(set);
        System.out.println(set.size());

//        set.remove("hi");
        System.out.println(set.contains("hi"));

        /*
        //access value 1 by 1 inside a for-each loop
        for(String v:set){
            System.out.println(v);
        }
        */
    }
}
