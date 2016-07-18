public class Solution {
    // public int bulbSwitch(int n) {
    //     if (n==0)return 0;
    //     int count = 0;
    //     int[] a = new int[n+1];
    //     int times = 0;
    //     while (++times <= n){
    //         //change
    //         for (int i=1;i<=n;i++)
    //             if (i%times == 0)Switch_num(i,a);
    //     }

    //     for (int j=1;j<=n;j++)
    //         if (a[j] == 1)count++;

    //     return count;
    // }
    // public void Switch_num(int n,int a[]){
    //     if (a[n] == 0)a[n]=1;
    //     else a[n]=0;
    // }
    // 普通算法超时o（n^2）
    
    // public int bulbSwitch(int n) {
    //     int count = 0;
    //     for (int i=1;i<=n;i++){
    //         int flag = 1;
    //         int num = 1;
    //         while (flag<=(i)/2)
    //             if(i%flag++ == 0)num++;
    //         if(num%2 == 1)count++;
    //     }
    //     return count;
    // }
    //遍历a[n] ，o（n）logn  超时
    
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
    /*
      对于某个数字i  如果他被调拨的次数为偶数 那么就是关闭的，奇数次就是开着的
      1.对于i：如果i为不能开方的数，那么i只能有偶数个因子
               如果i可以开方，那么i会有奇数个因子
               
      2.对于1-n  那么只需要统计1-n中能够开方的数即可
      3.1-n中能够开方的数的个数为：sqrt(n)
    */
}
