package Recursion;

import java.util.ArrayList;
import java.util.List;

public class iterativeApproachSubseq {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        List<List<Integer>>answer=sub(arr);
        System.out.println(answer);
    }

    static List<List<Integer>> sub(int[]arr){
        List<List<Integer>> outerlist=new ArrayList<>();
        outerlist.add(new ArrayList<>());
        for(int x:arr){
            int size= outerlist.size();
            for (int i = 0; i < size; i++) {
                List<Integer>innerList=new ArrayList<>(outerlist.get(i));
                innerList.add(x);
                outerlist.add(innerList);
            }
        }
        return outerlist;
    }
}
