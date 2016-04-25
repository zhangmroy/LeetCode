public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1;i++){
            int profit,max;
            if(prices[i] >= prices[i+1])continue;
            else{
                 max = i+1;
                for(int j = i+1;j < prices.length;j++)
                    if(prices[j] > prices[max])max = j;
            }
            profit = prices[max] - prices[i];
            if(maxProfit < profit )maxProfit = profit;
        }
        
        return maxProfit;
    }
}

/*
最简单的动态规划问题
 1.首先找到谷底,然后去求当前谷底对应峰顶.
 2.求出所有谷底和峰顶的差值后,返回最大值即可

改题要注意的问题是,数组越界问题.
*/
