// Last updated: 20/07/2026, 15:55:24
1class Solution {
2
3    public int removeDuplicates(int[] nums) {
4
5        if (nums.length <= 2)
6            return nums.length;
7
8        int index = 2;
9
10        for (int i = 2; i < nums.length; i++) {
11
12            if (nums[i] != nums[index - 2]) {
13                nums[index++] = nums[i];
14            }
15        }
16
17        return index;
18    }
19}