// Last updated: 20/07/2026, 10:14:48
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        if (nums.length == 0) {
5            return 0;
6        }
7
8        int i = 0;
9
10        for (int j = 1; j < nums.length; j++) {
11            if (nums[j] != nums[i]) {
12                i++;
13                nums[i] = nums[j];
14            }
15        }
16
17        return i + 1;
18    }
19}