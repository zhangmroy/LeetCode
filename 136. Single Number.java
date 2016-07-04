public class Solution {
    public int singleNumber(int[] nums) {
        //异或运算的特性是：不管顺序如何，总是可以将一组数字中重复的数据擦掉
        int result = 0;
        for(int i=0;i<nums.length;i++)
            result = result ^ nums[i];
        return result;
    }
}
