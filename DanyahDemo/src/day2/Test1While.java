package day2;

public class Test1While {
    public static void main(String[] args) {
        //print hello for 5 times
        /*
        int i = 1;
        while(i<=5){
            System.out.println("hello"+i);
            i++;
        }
         */

        /*
//        print 1 ,2,3,4,5....,98,99,100
//        calculate the result of 1+2+3+...+100;
        int i = 1;
        int sum = 0;
        while (i <= 100) {
//            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println(sum);

         */
        /*
        //print 1,3,5,7,9....99
        int i=1 ;
        while(i<=100){
//            System.out.println(i);
//            i+=2;
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
*/
        int i = 100;
        while(i<1000){
            String iString = i+"";  //158   ->  "158"
            int a = iString.charAt(0)-48;         //ASCII
            int b = iString.charAt(1)-48;
            int c = iString.charAt(2)-48;
//            System.out.println(a+"---"+b+"---"+c);
            if(a*a*a + b*b*b + c*c*c==i){
                System.out.println(i);
            }
//            System.out.println((int)a);
//            System.out.println((int)b);
//            System.out.println((int)c);
            i++;
            //char->character           '8'->code:56        'a'->97
        }
    }
}
