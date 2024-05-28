package TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] r = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        for(int result : r){
            System.out.println(result);
        }
    }
}
