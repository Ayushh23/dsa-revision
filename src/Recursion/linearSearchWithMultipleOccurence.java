package Recursion;

import java.util.ArrayList;

public class linearSearchWithMultipleOccurence {
    public static void main(String[] args) {
        int []arr={1,2,3,4,1,5,6};
        System.out.println(thirdmethod(arr,1,0));
    }



    static ArrayList<Integer> linear(int arr[],int target,int i){
        ArrayList<Integer>index=new ArrayList<>();
        return helper(arr,target,i,index);

    }

    static ArrayList<Integer> helper(int []arr,int target,int i, ArrayList<Integer>index){
        if(i==arr.length)return index;

        if (arr[i]==target)index.add(i);


        return helper(arr,target,i+1,index);

    }


    static ArrayList<Integer> secondmethod(int[]arr,int target,int i){
        if(i== arr.length)return new ArrayList<>();

        ArrayList<Integer>ans=secondmethod(arr,target,i+1);

        if(arr[i]==target){
            ans.add(i);
        }

        return ans;

    }

    static ArrayList<Integer> thirdmethod(int []arr,int t,int i){
        ArrayList<Integer>list=new ArrayList<>();

        if (i== arr.length)return list;

        if (arr[i]==t){
            list.add(i);
        }
        ArrayList<Integer>frombelow=thirdmethod(arr,t,i+1);

        list.addAll(frombelow);
        return list;
    }
}
