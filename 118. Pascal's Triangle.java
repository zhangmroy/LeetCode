public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0)return list;
        for(int i=0;i<numRows;i++){
            List<Integer>temp = new ArrayList<Integer>();
            temp.clear();
            if(i==0){temp.add(1);list.add(temp);}
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){temp.add(1);}
                    else temp.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            list.add(temp);
            }
        }
        return list; 
        
    }
}

/**
  1.提取特殊情况
  2.对于每一行的非头尾结点，值都是由上一个行的相邻两个值的和得出
*/
