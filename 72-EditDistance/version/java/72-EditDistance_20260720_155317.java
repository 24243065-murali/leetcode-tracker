// Last updated: 20/07/2026, 15:53:17
1class Solution {
2    public void sortColors(int[] nums) {
3
4        int low = 0;
5        int mid = 0;
6        int high = nums.length - 1;
7
8        while (mid <= high) {
9
10            if (nums[mid] == 0) {
11
12                int temp = nums[low];
13                nums[low] = nums[mid];
14                nums[mid] = temp;
15
16                low++;
17                mid++;
18            }
19            else if (nums[mid] == 1) {
20                mid++;
21            }
22            else {
23
24                int temp = nums[mid];
25                nums[mid] = nums[high];
26                nums[high] = temp;
27
28                high--;
29            }
30        }
31    }
32}