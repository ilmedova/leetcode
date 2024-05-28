class Solution:
    def myAtoi(self, s: str) -> int:
        if len(s) == 0:
            return 0
        s = s.strip()
        negative = False
        if len(s) > 1 and s[0] == '-':
            negative = True
            s = s[1:]
        if len(s) > 1 and s[0] == '+' and negative is False:
            s = s[1:]
        numerics = {
            '1' : 1,
            '2' : 2,
            '3' : 3,
            '4' : 4,
            '5' : 5,
            '6' : 6,
            '7' : 7,
            '8' : 8,
            '9' : 9
        }
        res = 0
        start = 0
        while len(s) > 0 and s[start] == '0':
            s = s[1:]
        print(s)
        for i in s:
            if i == '0':
                res = res * 10
            elif numerics.get(i):
                res = res * 10 + numerics.get(i)
            else:
                break
        if negative: res *= -1
        if res >= 2 ** 31:
            return 2147483647
        elif -2 ** 31 > res:
            return -2147483648
        return res