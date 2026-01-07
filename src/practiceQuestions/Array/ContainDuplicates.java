package practiceQuestions.Array;

public class ContainDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(check(arr));
    }

    static boolean check(int []arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j])return false;
            }
        }
        return true;
    }
}
