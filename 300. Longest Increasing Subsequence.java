public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length<=1)return nums.length;
        int res = 0;
        int dp[] = new int[nums.length];

        dp[0] = 1;
        for (int i=0;i<nums.length;i++){
            dp[i] = 1;
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j] && dp[j]+1>dp[i])
                    dp[i] = dp[j]+1;

                res = Math.max(res,dp[i]);
            }
        }
        return res;
    }
}

/*
  dp思想：
  1.dp[i] 用于存i处的最大子序列
  2.那么dp[i]和i之前的递推关系是: 0-i之前的dp[] 中+1去替换dp[i]中的数
*/
