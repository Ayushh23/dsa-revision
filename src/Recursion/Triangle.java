package Recursion;

public class Triangle {
    public static void main(String[] args) {
        int n =5;
        printstar(n);
    }
    static void printstar(int n){
        helper(n,0);
    }

    static void helper(int r,int c){
        if(r==0)return;
        if(c<r){
            helper(r,c+1);
            System.out.print("*");


        }
        else{
            helper(r-1,0);
            System.out.println();

        }
    }


    static void normalmethod(int n){
        for(int i=n;i>0;i--){
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
