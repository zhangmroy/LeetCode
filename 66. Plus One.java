public class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        int len = digits.length;
        for(int i = len-1;i>=0;i--){
            flag = false;
            if(digits[i] < 9){digits[i]++;return digits;}
            flag = true;
            digits[i]=0;
        }
        if(flag){
            int[] res = new int[len+1];
            for(int j=len-1;j>=0;j--)
                res[j+1] = digits[j];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
