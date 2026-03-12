package practiceQuestions.BitManipulation;

public class complementOfNumber {
    public static void main(String[] args) {
        int x=5;
        System.out.println(complement(x));
    }
    static int complement(int x){
        int temp=x;
        int mask=0;
        while(temp>0){
            mask=(mask<<1) | 1;
            temp=temp>>1;
        }
        return mask^x;
    }
}
