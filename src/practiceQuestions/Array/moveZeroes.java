package practiceQuestions.Array;

import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while
// maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class moveZeroes {
    public static  void main(String []ars){
        int []arr={0,1,0,3,12};
       moving(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moving(int[]arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        while(k< arr.length){
            arr[k++]=0;
        }
    }

}
