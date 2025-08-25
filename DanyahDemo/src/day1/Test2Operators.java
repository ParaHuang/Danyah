package day1;

public class Test2Operators {
    public static void main(String[] args) {
        System.out.println(3+5<6+2);

        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false
        System.out.println();

        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true
        System.out.println(false || false); //false
        System.out.println();

        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
        //                  5    4       1
        System.out.println(1+4> 8/2 && 3*2%5 == 1);//true

//        int x =  78%9*2;
        int x = 5;
        x += 3; //x = x+3;

        System.out.println(x);
    }
}
