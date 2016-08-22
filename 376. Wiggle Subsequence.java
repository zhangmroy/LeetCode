public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)return nums.length;
        int res = 1;
        boolean flag =  nums[1] > nums[0];

        for (int i=1;i<nums.length;i++){
            if (flag&&(nums[i]>nums[i-1]) || !flag&&(nums[i]<nums[i-1])){
                res++;
                flag = !flag;
            }
        }
        return res;
    }
}


/*
  贪心算法：
  统计所有第一个出现的与之前趋势不同的坡坡~ 
*/
