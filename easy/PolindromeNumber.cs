public class Solution {
    public bool IsPalindrome(int x) {
        string stval = x.ToString();
        var result = true;
        for(var i = 0; i < stval.Count(); i++){
            if(stval[i] != stval[stval.Count()-1-i]){
                result = false;
                break;
            }
        }
        return result;
    }
}