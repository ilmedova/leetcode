from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0: return ""
        if len(strs) == 1: return strs[0]
        s = ""
        for i in range(0, len(strs[0])):
            wordCount = 1
            exists = True
            add = True
            while wordCount < len(strs):
                if i < len(strs[wordCount]) and strs[wordCount][i] != strs[0][i]:
                    exists = False
                elif i >= len(strs[wordCount]):
                    add = False
                wordCount+=1
            if exists and add:
                print(exists, add)
                s+=strs[0][i]
            else:
                break
        return s