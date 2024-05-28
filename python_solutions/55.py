from typing import List


class Solution:
    def canJump(self, nums: List[int]) -> bool:
        steps = 0
        for i in nums:
            print(i, steps)
            if steps < 0:
                return False
            elif i > steps:
                steps = i
            steps -= 1
        return True