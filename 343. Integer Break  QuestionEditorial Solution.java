public class Solution {
    public int integerBreak(int n) {
        if (n < 4)return n-1;
        else {
            int res = 1;
            int div = n/3;
            int left = n%3;
            for (int i=0;i<div-1;i++)
                res *= 3;

            switch (left){
                case 1:
                    res*=4;
                    return res;
                case 2:
                    res*=6;
                    return res;
                case 0:
                    res*=3;
                    return res;
                default:
                    break;
            }

            return res;
        }
    }
}

/*
  归纳法：
  关键在于需要发现当n>=4后，所有的整数值都需要划分成为小于等于3的因子才能使得乘积最大化。
*/
