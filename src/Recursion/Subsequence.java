package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String s="abc";
        sub(s,"");
    }

    static  void sub(String up, String p ){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch= up.charAt(0);

        sub(up.substring(1),p+ch);
        sub(up.substring(1),p);

    }

    static ArrayList<String> sub2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);

        ArrayList<String>left=sub2(p+ch,up.substring(1));
        ArrayList<String>right=sub2(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
