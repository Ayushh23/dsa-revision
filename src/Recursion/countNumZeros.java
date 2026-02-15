package Recursion;

public class countNumZeros {
    public static void main(String[] args) {
        int x=1010454550;
        System.out.println(zero(x,0));
    }
    static int zero(int x,int count){
        if (x==0){
            return count;
        }
        int rem=x%10;
        if (rem==0){
            return zero(x/10,count+1);
        }
        else {
            return zero(x/10,count);
        }
    }
}
