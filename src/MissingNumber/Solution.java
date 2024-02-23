package MissingNumber;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missingInt = 0;
        for(int i: nums){
            if(i != i+1){
                missingInt = i+1;
            }
        }
        return missingInt;
    }
}
