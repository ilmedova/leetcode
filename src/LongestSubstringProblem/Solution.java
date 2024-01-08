package LongestSubstringProblem;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String substring = "";

        for(int i = 0; i < s.length(); i++){
            String temp = "";
            for (int k = i; k < s.length(); k++){
                boolean charExists = false;
                for(int j = 0; j < temp.length(); j++){
                    if(s.charAt(k) == temp.charAt(j)){
                        charExists = true;
                        if(temp.length() > substring.length()) {
                            substring = temp;
                        }
                        temp = "";
                        break;
                    }
                }
                if(!charExists){
                    temp+=s.charAt(k);
                }
                else{
                    break;
                }
            }
            if(temp.length() > substring.length()){
                substring = temp;
            }
        }
        return substring.length();
    }
}
