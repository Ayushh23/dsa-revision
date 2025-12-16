package Sorting;

import java.util.Arrays;

public class mergeSort{
    public static void main(String []args){
        int []arr={1,3,2,9,6,5};
        int[]arr2=mergeSorting(arr);
        System.out.println(Arrays.toString(arr2));
    }
    static int []mergeSorting(int []arr){
        if(arr.length==1)return arr;
        int mid=arr.length/2;
        int []left=mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int []right=mergeSorting(Arrays.copyOfRange(arr,mid,arr.length));

        return merging(left,right);
    }

    static int [] merging(int[]left,int []right){
        int []  mergedarr=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mergedarr[k++]=left[i++];
            }
            else {
                mergedarr[k++]=right[j++];}
        }

        while(i<left.length){
            mergedarr[k++]=left[i++];
        }
        while(j<right.length){
            mergedarr[k++]=right[j++];
        }
        return mergedarr;
    }
}