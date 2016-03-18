class Solution {
public:
    bool isUgly(int n) {
        if(n < 1)return false;
        while((n%2 == 0) || (n%3 == 0) || (n%5 == 0)){
            if(n%2 == 0)n = n/2;
            if(n%3 == 0)n = n/3;
            if(n%5 == 0)n = n/5;
        }
        if(n == 1)return true;
        else return false;
    }
};

/*class Solution {
public:
    bool isUgly(int n) {
        if(n <= 0)return false;
        while(n > 1){
            if(n%2 == 0)n = n/2;
            else if(n%3 ==0)n = n/3;
            else if(n%5 ==0)n = n/5;
            else return false;
        }
        return true;
    }
};
*/
/*
  1.分解因子,得到最终单因子,根据单因子判断
  2.可以用递归法判断
*/
