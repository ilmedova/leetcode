package MajorityElement;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(h.get(nums[i]) == null){
                h.put(nums[i], h.get(nums[i]));
            }
            else{
                h.put(nums[i], 1);
            }
        }
        int res = h.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).findFirst().get().getValue();
        return res;
    }
}
