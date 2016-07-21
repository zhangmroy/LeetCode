public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)return 0;
        if (nums.length == 1)return nums[0];
        return Math.max(common_rob(nums,0,nums.length-2),common_rob(nums,1,nums.length-1));
    }

    public int common_rob(int[] num,int start,int end){
        int length = end-start+1;
        if (length < 3)return Math.max(num[start],num[end]);

        int []money = new int[num.length];

        money[start] = num[start++];
        money[start] = Math.max(num[start],num[start++-1]);

        for (int i=start;i<=end;i++)
            money[i] = Math.max(money[i-2]+num[i],money[i-1]);
        return money[end];
    }
}

/*
  1.转化成为两个数列 ： 0 - length-2   1 - length-1
  2.分别用dp 解决  取最大值
  
*/
