class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        count = {}
        for i in nums: count[i] = nums.count(i)
        arr = list(count.values())
        m = max(arr)
        return arr.count(m) * m