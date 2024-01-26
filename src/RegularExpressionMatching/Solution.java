package RegularExpressionMatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        if(p.equals(".*")) return true;
        if(p.length() == s.length() && p.contains(".") == false && !p.contains("*")){
            if(p.equals(s)) return true;
            else return false;
        }
        int i = 0;
        int j = 0;
        while(p.charAt(j) == s.charAt(i)){
            i++;
            j++;
        }
        if(p.charAt(j) != '.' || p.charAt(j) != '*') return false;
        char tempS, tempP;
        if(p.charAt(j) == '.'){

        }
        return false;
    }
}
