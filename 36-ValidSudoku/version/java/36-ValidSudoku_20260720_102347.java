// Last updated: 20/07/2026, 10:23:47
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3
4        int n = nums.length;
5
6        for (int i = 0; i < n; i++) {
7
8            while (nums[i] > 0 &&
9                   nums[i] <= n &&
10                   nums[nums[i] - 1] != nums[i]) {
11
12                int temp = nums[i];
13                nums[i] = nums[temp - 1];
14                nums[temp - 1] = temp;
15            }
16        }
17
18        for (int i = 0; i < n; i++) {
19            if (nums[i] != i + 1) {
20                return i + 1;
21            }
22        }
23
24        return n + 1;
25    }
26}