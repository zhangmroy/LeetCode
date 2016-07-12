public class Solution {
    public int maxProfit(int[] prices) {
        //找出所有上升阶段的差值 并且求和
        
        int sum = 0;
        if(prices.length <= 1)return sum;
        
        int low=0;
        boolean state=false;
        if(prices[0]<=prices[1]){state=true;low=0;}
        
        for(int i=1;i<prices.length-1;i++){
            //最低点知道,寻找最高点
            if(prices[i]>prices[i+1])
                if(state){
                    state=false;
                    sum+=(prices[i]-prices[low]);
                    low=0;
                    continue;
                }
                
            //寻找最低点
            if(prices[i]<prices[i+1])
                if(!state){
                    state=true;
                    low=i;
                    continue;
                }
        }
        
        if(state==true)sum+=(prices[prices.length-1]-prices[low]);
        return sum;

    }
}
