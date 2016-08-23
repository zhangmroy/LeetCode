public class Solution {
    public int uniquePaths(int m, int n) {
//        if (m==0 || n==0)return 1;
//        else
//            return uniquePaths(m-1,n)+uniquePaths(m,n-1);
        int [][]metrix = new int[m][n];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (i==0 || j==0)metrix[i][j]=1;
                else metrix[i][j]= metrix[i-1][j]+metrix[i][j-1];
            }

        return metrix[m-1][n-1];
    }
   
}

/*
  第一种递归法，思路简单，超时
  第二种采用dp  便利一次矩阵可以求出结果：辅助矩阵用来存储到达metrix[i][j]所需要的步骤。
  
  1.由于只能走right 和 down ， 那么i==0 || j==0上面的点只能有一种走法
  2.根据对于某个点 metrix[i][j]，上一步到达他的点只有up 和left 。 那么直接把对应的up 和 left 上面可行的方法相加即可求出。

*/
