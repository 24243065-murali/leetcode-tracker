// Last updated: 20/07/2026, 15:44:44
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int maxSum = nums[0];
5        int currentSum = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8
9            // Either start a new subarray or extend the current one
10            currentSum = Math.max(nums[i], currentSum + nums[i]);
11
12            // Update maximum sum found
13            maxSum = Math.max(maxSum, currentSum);
14        }
15
16        return maxSum;
17    }
18}