package Recursion;

//Given a string find its first uppercase letter
//Examples :
//
//Input : geeksforgeeKs
//Output : K
//
//Input  : geekS
//Output : S

public class Firstuppercaseletter {
    public static void main(String[] args) {
        String s= "geeksforgeeKs";
        System.out.println(checkuppr(s,0));
    }

    static  char checkuppr(String s,int i){
        if(s.length()==0)
        {
            return 0;

        }
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        else{
            return checkuppr(s,i+1);
        }


    }

}
