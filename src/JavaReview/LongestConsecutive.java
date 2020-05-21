package JavaReview;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println("Longest consecutive: " + LongestConsec(arr));
    }
    public static int LongestConsec(int arr[]){
        HashSet<Integer> hset = new HashSet<>();
        int result = 0;
        for (int i=0; i<arr.length; i++)
            hset.add(arr[i]);
       for (int i=0; i<arr.length; i++) {
            if (!hset.contains(arr[i]-1)) {
                int count = arr[i];
                while (hset.contains(count))
                    count++;
                if (result<count-arr[i])
                    result = count-arr[i];
            }
        }
        return result;
    }
}
