public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int [][]sum = new int[row+1][column+1];

        for (int i=0;i<=row;i++)
            sum[i][0] = 0;
        for (int j=0;j<=column;j++)
            sum[0][j] = 0;


        for (int i=1;i<=row;i++)
            for (int j=1;j<=column;j++)
                if (i!=1 && j!=1)sum[i][j] = Math.min(grid[i-1][j-1] + sum[i - 1][j], grid[i-1][j-1] + sum[i][j - 1]);
                    else sum[i][j] = Math.max(grid[i-1][j-1] + sum[i - 1][j], grid[i-1][j-1] + sum[i][j - 1]);

        return sum[row][column];
    }
}

/*
  dp问题,递推公式:
  dp[i][j] = min{dp[i-1][j],dp[i][j-1]}+grid[i][j]
*/
