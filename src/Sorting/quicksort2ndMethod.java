package Sorting;

import java.util.Arrays;

public class quicksort2ndMethod {

    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void qs(int []arr, int low,int high){
        if (low<high){
            int partitionIndex=find(arr,low,high);
            qs(arr,low,partitionIndex-1);
            qs(arr,partitionIndex+1,high);
        }

    }
    static int find(int []arr,int low,int high){
        int start=low;
        int end=high;
        int pivot=arr[low];
        while(start<end){
            while(start<=high&&arr[start]<=pivot){
                start++;
            }
            while (end>=low&&arr[end]>pivot){
                end--;
            }
            if (start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        int temp =arr[end];
        arr[end]=arr[low];
        arr[low]=temp;
        return end;
    }


}



