package practiceQuestions.TwoPointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=9;
        int []ansarr=twosum(arr,target);
        System.out.println(Arrays.toString(ansarr));

    }


    static int[]twosum(int[]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==target)return new int[]{i,j};
            }
        }
        return  new int[]{-1,-1};

    }
}
