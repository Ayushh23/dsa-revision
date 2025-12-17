package BinarySearch;

public class binarySearch {
    public static void main(String []args){
        int []arr={1,3,5,6,8,9};
        int target=9;
        System.out.println(binary(arr,target));
    }
    static int binary(int []arr, int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}
