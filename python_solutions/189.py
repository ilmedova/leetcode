from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        if k == 0 or len(nums) <= 1:
            return
        rotational_amount = k % len(nums)
        nums[:] = nums[-rotational_amount:] + nums[:-rotational_amount]