package ValidPalindrome;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s.isPalindrome("race a car"));
        System.out.println(s.isPalindrome(" "));
        System.out.println(s.isPalindrome("Marge, let's \\\"[went].\\\" I await {news} telegram."));
    }
}
