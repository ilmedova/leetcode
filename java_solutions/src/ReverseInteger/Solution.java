package ReverseInteger;

class Solution {
    public int reverse(int x) {
        if(x < 2147483647 && x>-2147483648){
            long r = 0;
            boolean isNegative = (x < 0) ? true : false;
            x = (isNegative) ? x * (-1) : x;
            while(0 < x){
                r = (r * 10) + (x%10);
                x = (x-(x%10))/10;
            }
            if(r > 2147483646 && r>-2147483647) return 0;
            return (isNegative) ? (int)r * (-1): (int)r;
        }
        return 0;
    }
}
