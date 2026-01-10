package practiceQuestions.Array;

public class MaxmSubarray {
//    #Kadane Algorithm
    public static void main(String[] args) {
        int []arr={1};
        System.out.println(maxSum(arr));
    }
    static int maxSum(int []arr){
        if (arr.length==1)return arr[0];
        int csum=arr[0];
        int msum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            csum=Math.max(arr[i],csum+arr[i]);
            msum=Math.max(msum,csum);
        }
        return msum;
    }
}
