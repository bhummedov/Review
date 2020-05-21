package JavaReviewCodes;

public class LargestNumber{
    public static void main(String[] args) {
        int numbers[] = {242,657567,53,5435435,345,435,435,435,7,658,768};
        System.out.println(findMaxInArray(numbers));
    }
    public static int findMaxInArray(int arr[]){
        int max = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
