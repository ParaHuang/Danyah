package day5_encapsulation;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the no,name for the first student :");
        int no = sc.nextInt();
        String name = sc.next();
        //initialize (class->object)
        //ClassName instance = new ClassName();
        Student stu1 = new Student(no,name,18,"A6","male");//new:create
        //access field of an instance
        //instance.filed = value;
//        stu1.no = 1001;
//        stu1.setNo(1001);
//        stu1.name = "Jack";
//        stu1.setName("Jack");
//        stu1.age = -18;
//        stu1.setAge(18);
//        stu1.gender = "haha";
//        stu1.setGender("male");
//        stu1.cls = "A6";
//        stu1.setCls("A6");
        //call method of an instance
        //instance.method();
        stu1.study();
        stu1.takeExam();
//        System.out.println(stu1.name);
        System.out.println(stu1.getName());

        Student stu2 = new Student(1002,"Jo",17,"A6","male");  //1002,Jo,17,A6,male
//        System.out.println(stu2.name);
        stu2.study();
        stu2.takeExam();

        Student stu3 = new Student(1003,"Lily",16,"A5","female");   //1003,Lily,16,A5,female
        stu3.study();
        stu3.takeExam();

    }
}
