class Solution {
public:
    bool isPowerOfThree(int n) {
        const int flag = 1162261467; //3^19
        if(n <= 0 || n > flag)return false;
        return flag % n == 0;
    }
};

/*
  1.int数据的范围[-2^31 , 2^31 -1] 
  2.int范围内3^19是上限
  3.是三的幂值的数一定能被3^19整除
*/
