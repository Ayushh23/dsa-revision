package practiceQuestions.Array;
//Given an array nums, return true if the array was originally sorted in
//non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
//
//There may be duplicates in the original array.
//
//Note: An array A rotated by x positions results in an array
//B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
//Example 1:
//Input: nums = [3,4,5,1,2]
//Output: true
//Explanation: [1,2,3,4,5] is the original sorted array.
//You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
public class sortedOrNot {
    public static void main(String[] args) {
        int []arr={2,1,3,4,5};

        System.out.println(check(arr));
    }

    static boolean check(int []arr){
        int count=0;
        for (int i=0; i<arr.length-1;i++) {
                if(arr[i]>arr[i+1]){
                    count++;
                }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        return count<=1;
    }

}
