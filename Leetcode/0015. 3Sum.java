import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        HashSet<List<Integer>> hashout = new HashSet<>();
        int low, high;
        for (int i = 0; i < nums.length - 2; i++) {
            low = i + 1;
            high = nums.length - 1;
            while (low < high) {
                List<Integer> elt = List.of(nums[i], nums[low], nums[high]);
                if (nums[low] + nums[high] == -nums[i] && !hashout.contains(elt)) {
                    out.add(elt);
                    hashout.add(elt);
                } else if (nums[low] + nums[high] < -nums[i]) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return out;
    }
}