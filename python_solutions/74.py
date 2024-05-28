from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        t, b, row = 0, len(matrix) - 1, 0

        while t <= b:
            mid = (b + t) // 2
            if target > matrix[mid][-1]:
                t = mid + 1
            elif target < matrix[mid][0]:
                b = mid - 1
            else:
                row = mid
                break

        l, r = 0, len(matrix[row]) - 1

        while l <= r:
            m = (r + l) // 2
            print(m)
            if matrix[row][m] > target:
                r = m - 1
            elif matrix[row][m] < target:
                l = m + 1
            else:
                return True

        return False