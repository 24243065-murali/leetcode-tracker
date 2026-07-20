// Last updated: 20/07/2026, 10:15:06
1class Solution {
2    public int removeElement(int[] nums, int val) {
3
4        int i = 0;
5
6        for (int j = 0; j < nums.length; j++) {
7            if (nums[j] != val) {
8                nums[i] = nums[j];
9                i++;
10            }
11        }
12
13        return i;
14    }
15}