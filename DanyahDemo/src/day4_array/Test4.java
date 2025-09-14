package day4_array;

public class Test4 {
    public static void main(String[] args) {
//        int[] arr = {11,44,55,66};
//        int[][] arr = {
//                {23, 88, 11, 55},
//                {88, 90, 34},
//                {12, 20}
//        };
        //declared an 2d array,size is 3*4
//        int[][] arr = new int[3][4];
        //declared an 2d array,size is 3*?, every inner 1d array need to initialize separately
        int[][] arr = new int[3][];

        arr[0] = new int[5];
        arr[0][0] = 23;
        arr[0][1] = 23;
        arr[0][2] = 23;
        arr[0][3] = 23;
        arr[0][4] = 23;

        arr[1] = new int[4];
        arr[1][0] = 78;
        arr[1][1] = 78;
        arr[1][2] = 78;
        arr[1][3] = 78;

        arr[2] = new int[3];
        arr[2][0] = 90;
        arr[2][1] = 90;
        arr[2][2] = 90;
//        System.out.println(arr[1][1]);

        for(int i=0 ; i<arr.length ; i++){
//            System.out.print(arr[i][0]+"\t");
//            System.out.print(arr[i][1]+"\t");
//            System.out.print(arr[i][2]+"\t");
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
