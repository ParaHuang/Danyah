package day1;

import java.util.Scanner;

public class Test1Variable {
    public static void main(String[] args) {
        //primitive type: short int long         double float      char   boolean   byte
        //reference type: String Scanner
        //type variable = value;

        int a = 3;
        double b = 3.14;
        char c = '@';
        boolean d = true;

        String e = "hi";
        Scanner sc = new Scanner(System.in);
        //input an integer number
        int f = sc.nextInt();   //programe would stick at here to wait for you entering

        //System.out.println("normal content1" + variable1 + "normal content2" + variable2);//concat
        System.out.println("what saved in a is "+a);
        System.out.println(b);
        System.out.print(c+"\n");
        System.out.print(d+"\n");
        //placeholder:    %d    ->  int , %s    ->  String  , %f    ->  float,double
        //System.out.printf("a string with placeholders",value1,value2,value3);
//        System.out.printf("what saved in a is %d \n",a);
//        System.out.printf("what saved in e is %s \n",e);//with format
        System.out.printf("f = %d ,b = %.3f , e = %s",f,b,e);
    }
}
