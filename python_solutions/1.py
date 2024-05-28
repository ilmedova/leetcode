from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numIndexes = {}
        for i in range(len(nums)):
            if target - nums[i] in numIndexes:
                return [numIndexes[target - nums[i]], i]
            numIndexes[nums[i]] = i
        return []
