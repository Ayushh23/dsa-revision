package practiceQuestions.TwoPointerandSlidingWindow;

public class MaxmPoints {
    public static void main(String[] args) {
        int []arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        System.out.println(maxpoint(arr,k));
    }
    static int maxpoint(int[]arr,int k){
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for (int i = 0; i < k; i++) {
            leftsum+=arr[i];
        }
        maxsum=leftsum;
        int j= arr.length-1;
        for (int i = k-1; i >=0 ; i--) {
            rightsum+=arr[j];
            leftsum=leftsum-arr[i];
            j--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}
