package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int []arr={1,3,2,9,6,5};
        quick(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void quick(int[] arr){
        helper(arr,0,arr.length-1);
    }

    static void helper(int[]arr,int low,int hi){
        if (low>=hi)return;
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }
        helper(arr,low,e);
        helper(arr,s,hi);


    }
}
