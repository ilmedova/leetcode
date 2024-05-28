class Solution:
    def fib(self, n: int) -> int:
        if n == 0: return 0
        if n == 1: return 1
        a = 0
        b = 1
        c = 2
        while c < n:
            a, b = b, a + b
            c += 1
        return a + b