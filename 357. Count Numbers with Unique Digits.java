public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // int start = 0;
        // int end = (int)Math.pow(10,n);
        // int count = 0;
        // Set<Integer> set = new HashSet<Integer>();

        // for (int num=start;num<end;num++){
        //     set.clear();
        //     //judge
        //     boolean flag = false;
        //     int temp_num = num;
        //     while (temp_num > 0){
        //         int temp = temp_num % 10;
        //         temp_num /= 10;
        //         if (set.contains(temp)){flag=true;break;}
        //         else set.add(temp);
        //     }
        //     if (flag)count++;
        // }
        // return (int)Math.pow(10,n)-count;
        
         //第常规算法超时,不能正常遍历
         //归纳总结法
        int f1 = 10;
        int f2 = 81;
        int res = f1+f2;
        if (n>10)return 0;
        else if (n==0)return 1;
        else if (n==1)return f1;
        else if (n==2)return res;
        else{
            int temp = 2;
            int sum = f2;
            while (temp<n){
                sum = sum*(10-temp++);
                res += sum;
            }
            return res;
        }
    }
}
