from typing import List


class Solution:
    def calPoints(self, operations: List[str]) -> int:
        arr = []
        for i in range(len(operations)):
            if operations[i] == 'C':
                arr.pop()
            elif operations[i] == '+':
                arr.append(arr[-1] + arr[-2])
            elif operations[i] == 'D':
                arr.append(arr[-1] * 2)
            else:
                arr.append(int(operations[i]))
        return sum(arr)
