class Solution {
public:
    bool isHappy(int n) {
        if(n == 1)return true;
        int flag = 0;
        int * a;
        a = (int *)malloc(1000 * sizeof(int));
        
        while(1){
            int sum = 0;
            while(n > 0){
                int num = n%10;
                sum = sum + pow(num,2);
                n = n/10;
            }
            if(sum == 1)return true;
            for(int i = 0;i < flag;i++)
                if(a[i] == sum)return false;
            a[flag++] = sum;
            n = sum;
        }
        return true;
    }
};

// 可以用递归
// 
