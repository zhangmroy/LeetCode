public class Solution {
    public int maxSubArray(int[] nums) {
        int sum_check = nums[0]>0?nums[0]:0;
        int sub_num[] = new int[nums.length];

        sub_num[0] = nums[0];

        for (int i=1;i<nums.length;i++){
            sub_num[i] = (sum_check+nums[i])>sub_num[i-1]?(sum_check+nums[i]):sub_num[i-1];
            sum_check = (sum_check+nums[i])>0?(sum_check+nums[i]):0;
        }
        return sub_num[nums.length-1];
    }
}

/*
  dp思想：
  1.sum_check（>=0）统计累计和
  2.sub_num[]辅助数列，用于统计遍历到num[i]的时候最大的值
*/
