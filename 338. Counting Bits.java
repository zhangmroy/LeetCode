public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=1;i<=num;i++){
            int j = i;
            int count = 0;
            while (j != 0){
                res[i]++;
                j = j&(j-1);
            }
        }
        return res;
    }
}
/*
  1.n 和 n-1 相与的结果是：n把自己最低位的1去掉
  2.在n != 0的时候，重复1步骤，那么可以轻松统计1的个数
*/
