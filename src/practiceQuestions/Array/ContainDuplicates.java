package practiceQuestions.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,3,4,1};
        System.out.println(optimiseCheckSet(arr));
    }

    static boolean check(int []arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j])return true;
            }
        }
        return false;
    }

    static boolean optimiseCheckMap(int []arr){
        Map<Integer,Integer>map=new HashMap<>();
        for (int x:arr){
             map.put(x, map.getOrDefault(arr,0)+1);
         }
         for(int y: map.values()){
             if (y>1)return true;
         }
         return false;
    }
    static boolean  optimiseCheckSet(int []arr){
        Set<Integer> set=new HashSet<>();
        for (int x:arr){
            if(set.contains(x))return true;
            else {
                set.add(x);
            }
        }
        return false;
    }
}
