package ContainsDuplicate;

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(Arrays.stream(nums).distinct().count() == nums.length) return true;
        return false;
    }
}
