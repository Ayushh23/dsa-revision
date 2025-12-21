package practiceQuestions.BitManipulation;


import java.sql.SQLOutput;

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//
//
//
//Example 1:
//
//Input: n = 1
//Output: true
//Explanation: 2^0 = 1
//Example 2:
//
//Input: n = 16
//Output: true
//Explanation: 2^4 = 16
public class powerOf2 {
    public static void main(String[] args) {
        int n=20;
        System.out.println(check(n));
    }

    static boolean check(int n){
        if(n<=0)return false;

        return (n&n-1)==0;
    }
}
