public class Solution {
    public void moveZeroes(int[] nums) {
        int flag1 = 0,flag2 = nums.length - 1;
        int i = flag1 ,count = 0;
        while(flag1 <= flag2 ){
            if(i == nums.length){
                nums[flag2--] = 0;
                count--;
                if(count ==  0)break;
            }
            else{
                if(nums[i] != 0)nums[flag1++] = nums[i];
                else count++;
                i++;
            }
        }
    }
}
