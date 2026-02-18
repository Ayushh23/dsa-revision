package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr={1,7,2,3,8,5,4};
        selectionSortRec(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-i-1;
            int maxindex=max(arr,0,last);
            swap(arr,last,maxindex);
        }

    }

    static void swap(int []arr,int first , int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }

    static int max(int []arr,int i,int j){
        int max=i;
        for (int k=i;k<=j;k++){
            if (arr[max]<arr[k]){
                max=k;
            }
        }
        return max;
    }


    static void selectionSortRec(int []arr){
//        helper(arr,0);
        helper2(arr,arr.length,0,0);
    }

    static  void helper(int []arr,int i){
        if (i== arr.length-1)return ;
        int last=arr.length-i-1;
        int maxindex=max(arr,0,last);
        swap(arr,maxindex,last);
        helper(arr,i+1);

    }

    static void helper2(int []arr,int r,int c,int max){
        if (r==0)return;
        if (c<r){
            if (arr[c]>arr[max]){
                helper2(arr,r,c+1,c);
            }
            else {
                helper2(arr,r,c+1,max);
            }
        }
        else {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            helper2(arr,r-1,0,0);
        }
    }
}
