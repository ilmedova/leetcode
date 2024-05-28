package ValidPalindrome;

import java.util.Arrays;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String r = new StringBuilder(s).reverse().toString();
        if(s.equals(r)) return true;
        return false;
    }
}
