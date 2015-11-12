public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        //int length = Array.getLength(nums);
        int length = nums.length;
        return nums[nums.length / 2];
    }
}
