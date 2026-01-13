package practiceQuestions.BitManipulation;

public class divideTwoInteger {
    public static void main(String[] args) {
        int dividend=10;
        int divisor=3;
        System.out.println(divide(dividend,divisor));
    }
    static  int divide(int dividend, int divisor){
        if (dividend ==Integer.MIN_VALUE&&divisor== -1) {
            return Integer.MAX_VALUE;
        }
        return (int)( dividend/divisor);

    }

}
