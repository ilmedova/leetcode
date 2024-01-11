package ReverseInteger;

class Solution {
    public int reverse(int x) {
        if(x < 1534236469 && x>-2147483645){
            int r = 0;
            boolean isNegative = (x < 0) ? true : false;
            x = (isNegative) ? x * (-1) : x;
            while(0 < x){
                r = (r * 10) + (x%10);
                x = (x-(x%10))/10;
            }
            return (isNegative) ? r * (-1) : r;
        }
        return 0;
    }
}
