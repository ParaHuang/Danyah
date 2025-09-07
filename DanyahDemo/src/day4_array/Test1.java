package day4_array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //array->method->OOP->Collection->

        //define array
        //1.declare about type,length, then array will be fulfilled with default value
        //int->0    double->0.0      boolean->false    String->null
        //type[] arrayName = new type[length];
        int[] arr = new int[5];

        //input value
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //use by index:0~length-1
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
