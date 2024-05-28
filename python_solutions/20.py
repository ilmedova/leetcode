class Solution:
    def isValid(self, s: str) -> bool:
        arr = []
        for i in range(len(s)):
            if len(arr) > 0 and ((s[i] == ')' and arr[-1] == '(') or (s[i] == '}' and arr[-1] == '{') or (s[i] == ']' and arr[-1] == '[')):
                arr.pop()
            elif s[i] in ['(', '{', '[']:
                arr.append(s[i])
            else:
                return False
        if len(arr) == 0:
            return True
        return False