package day4_array;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {45,88,25,61,89,10,21,34};
        mergeSort(arr,0,arr.length-1);  //start to sort     low:0,hgih:7

    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);         //left part
            mergeSort(arr,mid+1,high);  //right part
            //merge
        }
    }


    //merge
    
}
