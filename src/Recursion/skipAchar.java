package Recursion;

public class skipAchar {
    public static void main(String[] args) {
        String x="baccba";
        String ans= skip(x,'a');
        System.out.println(ans);
    }

    static String skip(String x, char target){
        if(x.isEmpty()){
            return "";
        }
        char ch=x.charAt(0);
        if(ch==target){
            return skip(x.substring(1),target);

        }
        else{
            return ch+skip(x.substring(1),target);
        }
    }
}
