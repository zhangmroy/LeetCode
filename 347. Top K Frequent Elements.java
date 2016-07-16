public class Solution {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i]))map.put(nums[i],1);
            else map.replace(nums[i],map.get(nums[i])+1);
        }
        int length = map.size();

        if (k==0 || length==0)return res;
        //按照k全部输出
        while (!map.isEmpty() && k>0){
            Iterator iterator = map.keySet().iterator();
            Integer key_max = (Integer)iterator.next();
            while (iterator.hasNext()){
                Integer temp = (Integer)iterator.next();
                if (map.get(key_max) < map.get(temp))
                    key_max=temp;
            }
            res.add(key_max);
            k--;
            map.remove(key_max);
            length--;
        }
        return res;
    }
}
