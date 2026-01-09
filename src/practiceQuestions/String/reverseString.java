package practiceQuestions.String;

public class reverseString {
    public static void main(String[] args) {
        String x="Ayushr";
        System.out.println(rev(x));
    }

    static String rev(String x){
        char []arr=x.toCharArray();
        int left=0;
        int right= arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);

    }

}
