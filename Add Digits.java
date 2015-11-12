public class Solution {
    public int addDigits(int num) {
        int temp = 0;
        while(num > 0){
            temp +=  num % 10;
            if(temp >= 10) temp = temp / 10 + temp % 10;
            num = num / 10;
        }
        return temp;
    }
}
