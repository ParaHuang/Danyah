package day10;

public class Main2 {
    public static void main(String[] args) {
        //the length is fixed
        //create an array with length, this will initialize all elements with default value
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 12;
        arr[2] = 12;
        arr[3] = 12;
        arr[4] = 9;
        //index:
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
