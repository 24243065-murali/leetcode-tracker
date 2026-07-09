// Last updated: 09/07/2026, 10:06:51
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;

        while (l < r) {
            int water = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, water);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}