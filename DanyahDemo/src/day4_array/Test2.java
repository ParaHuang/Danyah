package day4_array;

public class Test2 {
    public static void main(String[] args) {
        //1.declare about type,length, then array will be fulfilled with default value
        //int->0    double->0.0      boolean->false    String->null
        //type[] arrayName = new type[length];

        //2.declare array with values
        //type[] arrayName = new type[]{value1,value2,value3,value4};
//        int[] arr = new int[]{45,88,25,61,89,10,21};
//        System.out.println(arr.length);

        //3.short way for 2
        //type[] arrayName = {value1,value2,value3,value4};
        int[] arr = {-45,-88,-25,-61,-89,-10,-21};
//        System.out.println(arr.length);

        //find the max value
        int max = arr[0],min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
