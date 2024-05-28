package TopKFrequentElements;

import java.util.HashMap;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        return h.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).limit(k).mapToInt(i -> i.getKey()).toArray();
    }
}
