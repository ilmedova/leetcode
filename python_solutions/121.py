from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min = prices[0]
        max = prices[0]
        results = []
        for i in range(len(prices)):
            if(min > prices[i] and i != len(prices)-1):
                min = prices[i]
                max = 0
            if(max < prices[i]):
                max = prices[i]
                results.append(max-min)
        results.sort(reverse=True)
        if(len(results) == 0): return 0
        return results[0]