public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var list = new List<int>();
        var is_target = false;
        for(var i=0; i < nums.Count(); i++){
            for(var j=0; j < nums.Count(); j++){
                if(j!=i && nums[i]+nums[j] == target){
                    is_target = true;
                    list.Add(i);
                    list.Add(j);
                    break;
                }
            }
            if(is_target){
                break;
            }
        }
        return list.ToArray();
    }
}