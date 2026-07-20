// Last updated: 20/07/2026, 10:29:52
1class Solution {
2    public int jump(int[] nums) {
3
4        int jumps = 0;
5        int currentEnd = 0;
6        int farthest = 0;
7
8        for (int i = 0; i < nums.length - 1; i++) {
9
10            farthest = Math.max(farthest, i + nums[i]);
11
12            // End of the current jump range
13            if (i == currentEnd) {
14                jumps++;
15                currentEnd = farthest;
16            }
17        }
18
19        return jumps;
20    }
21}