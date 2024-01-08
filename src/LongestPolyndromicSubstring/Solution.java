package LongestPolyndromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if(isPolindrome(s)){
            return s;
        }

        String substring = "";

        for(int i = 0; i < s.length(); i++){
            String temp = "";
            for(int j = i; j < s.length(); j++){
                temp += s.charAt(j);
                if(isPolindrome(temp) && substring.length() < temp.length()){
                    substring = temp;
                }
            }
        }

        return substring;
    }

    public boolean isPolindrome(String s){
        int l = s.length();

        for(int i = 0, j = l-1; i <= l/2 && j >= l/2;  i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
