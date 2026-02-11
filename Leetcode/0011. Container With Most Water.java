class Solution {
    public int area(int[] height, int i, int j) {
        return (Math.min(height[i], height[j]) * Math.abs(j - i));
    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = area(height, l, r);
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            max = Math.max(max, area(height, l, r));
        }
        return max;
    }
}