public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        return Get_Num(n,count);
    }

    public int Get_Num(int n,int count){
        if(n==0)return count;
        while (n%5 != 0)
            n--;
        n /= 5;
        count += n;
        return Get_Num(n,count);
    }
}

/*
  递归法：
  1.求出距离n最近的5的倍数
  2.提取一次5，统计到count
  3.用新的n重复1-2，最后返回count
*/
