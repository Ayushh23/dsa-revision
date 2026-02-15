package Recursion;

public class Reverse {
    public static void main(String[] args) {
        int num=1234;
        System.out.println(rev(num,0));
    }
    static int rev(int num ,int sum){
        if(num==0){
            return sum;
        }
        int rem=num%10;
        sum=sum*10+rem;
        return rev(num/10,sum);


    }
}
