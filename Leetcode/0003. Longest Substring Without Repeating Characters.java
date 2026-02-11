import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int max = 0;
        int left = 0, len = s.length();
        for (int right = 0; right < len; right++) {
            // System.out.println(left+" "+right+" "+seen);
            if (seen.contains(s.charAt(right))) {
                max = Math.max(max, right - left);
                while (s.charAt(left) != s.charAt(right)) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                left++;
            } else {
                seen.add(s.charAt(right));
            }
        }
        return Math.max(max, len - left);
    }
}