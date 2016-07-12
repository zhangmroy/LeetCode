public class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*  不让用除法,时间复杂度为o(n)
            1.由于output[i]={nums[1]* ... nums[i-1]} * {nums[i+1]*...nums[n]}
            2.新建数组res_left[],对于每个数res_left[i]=nums[1] *...nums[i-1]
            3.新建数组res_right[],对于每个数res_right[i]=nums[i+1] *...nums[n]
            4.output[i]=res_left[i]*res_right[i]
        */
        if(nums.length<=1)return nums;
        
        int[] res_left = new int[nums.length];
        int[] res_right = new int[nums.length];
        
        res_left[0] = res_right[nums.length-1] = 1;
        
        for(int i=1;i<nums.length;i++)
            res_left[i]=nums[i-1]*res_left[i-1];
        for(int j=nums.length-2;j>=0;j--)
            res_right[j]=nums[j+1]*res_right[j+1];
        
        for(int k=0;k<nums.length;k++)
            nums[k] = res_left[k]*res_right[k];
            
        return nums;
            
        
    }
}
