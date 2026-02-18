package Recursion;

public class powerof3 {
    public static void main(String[] args) {
        int n=24;
        System.out.println(check(n));
    }
    static boolean check(int n){
        return helper(n);
    }
    static boolean helper(int n){
        if(n<=0)return false;
        if(n==1)return true;

        if(n%3==0){
            return helper(n/3);
        }
        else{
            return false;
        }
    }

}
