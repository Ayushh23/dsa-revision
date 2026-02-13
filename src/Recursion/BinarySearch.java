package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int target=6;
        System.out.println(bin(arr,target, 0,arr.length-1));
    }
    static  int bin(int[]arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return mid;
        else if (arr[mid]<target) {
            return bin(arr,target,mid+1,end);
        }
        else{
           return bin(arr,target,start,mid-1);
        }
    }
}
