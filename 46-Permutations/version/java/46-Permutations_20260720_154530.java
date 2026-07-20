// Last updated: 20/07/2026, 15:45:30
1class Solution {
2    public boolean canJump(int[] nums) {
3
4        int maxReach = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7
8            // If current index is not reachable
9            if (i > maxReach) {
10                return false;
11            }
12
13            // Update the farthest reachable index
14            maxReach = Math.max(maxReach, i + nums[i]);
15
16            // If we can already reach the last index
17            if (maxReach >= nums.length - 1) {
18                return true;
19            }
20        }
21
22        return true;
23    }
24}