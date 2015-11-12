public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            //char temp = 'A';
            int val = s.charAt(i) - 'A' + 1;
            sum += val * Math.pow(26,(s.length() - 1 - i));
        }
        return sum;
    }
} 
