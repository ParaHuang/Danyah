package day3;

public class Test1For {
    public static void main(String[] args) {
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");



        for(int i=1 ; i<=5 ; i++){     //i->row
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
            for(int j=1 ; j<=50 ; j++){ //j->column
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        happen for N times
        for(int i=1 ; i<=N ; i++){

        }
         */

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        i=1-> *
        i=2-> **
        i=3-> ***
        i=4-> ****
        i=5-> *****
         */
    }
}
