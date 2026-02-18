package Recursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr={2,1,9,3,4,6};
        recursionbubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void recursionbubble(int []arr){
        helper(arr,0,0);
    }

    static void helper(int []arr,int i ,int j){
        if (i== arr.length)return;
        if(j<arr.length-i-1){
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            helper(arr,i,j+1);
        }
        else {
            helper(arr,i+1,0);
        }
    }


    static void sort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
