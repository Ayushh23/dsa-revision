package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubseqWithDuplicates {
    public static void main(String[] args) {
        
        int []arr={1,2,2};
        System.out.println(sequence(arr));
    }
    
    static List<List<Integer>> sequence(int []arr){
        List<List<Integer>>outerlist= new ArrayList<>();
        outerlist.add(new ArrayList<>());

        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=0;
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
            }
            int n = outerlist.size();
            end = outerlist.size()-1;
            for (int j = start; j < n; j++) {
                List<Integer>internal=new ArrayList<>(outerlist.get(j));
                internal.add(arr[i]);
                outerlist.add(internal);
            }
        }
        return outerlist;
    }
}
