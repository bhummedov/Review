package JavaReview;

import java.util.HashMap;

public class OddNumberTimes{
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, -2, 2, 4, -1, -2, 5};
        System.out.println(getOdd(arr));
    }
   public static int getOdd(int[] arr) {
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(hmp.containsKey(arr[i])) {
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            }
            else
                hmp.put(arr[i], 1);
        }
        for(Integer integer: hmp.keySet()) {
            if(hmp.get(integer) % 2 != 0)
                return integer;
        }
        return -1;
    }
}
