package day10;

import java.util.ArrayList;
import java.util.List;

//collection
//      |-------List(ArrayList,LinkedList)
//      |-------Set
public class Main3 {
    public static void main(String[] args) {
        //ClassName xx = new ClassName();
//        ArrayList list = new ArrayList();
        //SuperClass xx = new SubClass();
        List list = new ArrayList();

        //add values
        list.add("hello");
        list.add("hey");
        list.add("hi");
        list.add("hello");
        list.add("hey");
        list.add("hi");
        list.add("hello");
        list.add("hey");
        list.add("hi");
        list.add(10);
        list.add(3.14);
        list.add(true);
        list.add('w');
        System.out.println(list);
        System.out.println(list.size());

        //get value by index
        Object element = list.get(0);
    }
}
