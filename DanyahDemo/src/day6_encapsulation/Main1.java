package day6_encapsulation;

public class Main1 {
    public static void main(String[] args) {
        /*
        Date d1 = new Date();
        Date d2 = new Date(2020);
        Date d3 = new Date(2021,9);
        Date d4 = new Date(2022,8,12);

        //toString() is called automatically when you print the object
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3);
        System.out.println(d4);
*/


        Student s1 = new Student(1001,"Jack","Huang");
        Student s2 = new Student(1002,"Tom","Huang");
        System.out.println(s1);
        System.out.println(s2);
//
//        System.out.println();
//        s1.setTeacherName("Lucy");
//        System.out.println(s1);
//        System.out.println(s2);
    }
}
