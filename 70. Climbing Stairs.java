class Solution {
public:
    int climbStairs(int n) {
        if(n == 0 || n == 1)return 1;
        int bef = 1;
        int now = 1;
        for(int i = 1;i < n;i++){
            int temp = now + bef;
            bef = now;
            now = temp;
        }
        
        return now;
    }
};
