package LeastNumberOfUniqueIntegersAfterKRemovals;

import java.util.HashMap;

public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(h.get(arr[i]) != null) h.put(arr[i], h.get(arr[i])+1);
            else h.put(arr[i], 1);
        }
        //h.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).map(e -> )
        return 0;
    }
}
