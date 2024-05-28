package UniqueOccurrences;

import java.util.HashMap;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        if(h.values().stream().distinct().count() != h.values().stream().count()) return false;
        return true;
    }
}
