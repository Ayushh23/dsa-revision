package practiceQuestions.String;

public class palindrome {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
        System.out.println(check(s));
    }

    static boolean check(String s){
        String x=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left=0;
        int right=x.length()-1;
        while(left<right){
            if(x.charAt(left)!=x.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}
