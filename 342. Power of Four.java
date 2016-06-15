public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1)return true;
        if(num == 0)return false;
        long flag = (long)Math.pow(4,16);
        if(flag%num==0 && num%4==0 && Math.sqrt(num)%2==0)return true;
        else return false;
    }
}

/**
  1.排除特殊值0，1
  2.找到在int范围内最大的4的平方的值 pow（4，16）：
      a.如果某个数是4的平方，那么一定能整除pow（4，16）
      b.同时该数能被4整除
      c.该数一定能开方，而且开方后的值肯定能被2整除（用来排除128这种数）。
        

*/
