package Recursion;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Which fibonacci number ??");
        int n= scn.nextInt();
        System.out.println(recur(n));
    }

    static int recur(int n){
        if (n==0)return 0;
        if (n==1)return 1;
        return recur(n-1)+recur(n-2);
    }
}
