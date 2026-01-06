package practiceQuestions.TwoPointerandSlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=9;
//        int []ansarr=twosum(arr,target);
        int[]ansarr=twosumOpt(arr,target);
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


    static int[] twosumOpt(int []arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed=target-arr[i];

            if (map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }
}
