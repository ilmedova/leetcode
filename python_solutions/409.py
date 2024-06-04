class Solution:
    def longestPalindrome(self, s: str) -> int:
        words = {}
        for i in s:
            if i in words: words[i] = words[i] + 1
            else: words[i] = 1
        count, odd_found = 0, False
        for key in words:
            if words[key] % 2 == 0: count += words[key]
            else:
                odd_found = True
                count += words[key] - 1
        if odd_found: count+= 1
        return count