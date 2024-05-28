package TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i = 0;
        for(;i < nums.length; i++){
            for(int j = i+1;j < nums.length; j++){
                if(i != j && (nums[i] + nums[j] == target)){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if(arr[0] + arr[1] == target){
                break;
            }
        }
        return arr;
    }
}
