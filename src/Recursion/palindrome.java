package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String s="cockcoc";
        boolean check=pali(s,0,s.length()-1);
        if (check) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
    static boolean pali(String s, int i,int j){
        if(i==s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        else {
            return pali(s,i+1,j-1);
        }
    }
}
