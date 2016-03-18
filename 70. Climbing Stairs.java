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

/* 
动态规划
1.传统递归会超时
2.关键在于找到第n阶梯和第n+1阶梯方法的联系, 然后带入初始值(n= 1 时候只有一种)循环求解
*/
