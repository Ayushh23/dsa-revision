package Recursion;

public class skipAword {
    public static void main(String[] args) {
        String word="abaeapplede";
        System.out.println(skip(word,"apple"));
    }

    static String skip(String word, String target){
        if(word.isEmpty()){
            return "";
        }
        if (word.startsWith(target)){
            return skip(word.substring(target.length()),target);
        }
        else {
            return word.charAt(0)+skip(word.substring(1),target);
        }
    }
}
