package Anagram;


public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram"));
        System.out.println(s.isAnagram("rat", "car"));
        System.out.println(s.isAnagram("aacc", "ccac"));
    }
}
