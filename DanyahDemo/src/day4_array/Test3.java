package day4_array;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {45,88,25,61,89,10,21,34};
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
