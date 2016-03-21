class Solution {
public:
    bool isPowerOfTwo(int n) {
        //int flag = 2147483648;
        int flag = 1073741824; //2^30
        if(n <= 0 || n > flag)return false;
        return flag % n == 0;
    }
};

/*
  1.int 上下线
  2.找到2^30位上限
  3.看能否被整除
*/
