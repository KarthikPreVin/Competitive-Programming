import java.util.*;

class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int recursion(int[] nums, Integer i) {
        if (i >= nums.length) {
            return 0;
        }
        if (map.get(i) != null) {
            return map.get(i);
        }
        int include = nums[i] + recursion(nums, i + 2);
        int exclude = recursion(nums, i + 1);
        int out = Math.max(include, exclude);
        map.put(i, out);
        return out;
    }

    public int rob(int[] nums) {
        return recursion(nums, 0);
    }
}