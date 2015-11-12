public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums)s.add(i);
        return nums.length != 0 && s.size() != nums.length;
    }
}
