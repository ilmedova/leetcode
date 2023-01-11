public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if(strs.Count() == 0){
            return "";
        }
        else if(strs.Count() == 1){
            return strs[0];
        }
        int size = strs.Length;
        Array.Sort(strs);

        int end = Math.Min(strs[0].Length,strs[size-1].Length);

        int i = 0;
        while (i < end && strs[0][i] == strs[size-1][i]){
            i++;
        }
        return strs[0].Substring(0, i);
    }
}