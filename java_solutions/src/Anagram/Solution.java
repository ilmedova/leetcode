package Anagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        s = Arrays.stream(s.split("")).sorted().reduce((s1, s2) -> s1+s2).toString();
        t = Arrays.stream(t.split("")).sorted().reduce((s1, s2) -> s1+s2).toString();
        if(s.equals(t)) return true;
        return false;
    }
}
