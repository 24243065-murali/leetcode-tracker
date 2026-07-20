// Last updated: 20/07/2026, 10:18:45
1class Solution {
2
3    public int[] searchRange(int[] nums, int target) {
4
5        int first = findFirst(nums, target);
6        int last = findLast(nums, target);
7
8        return new int[]{first, last};
9    }
10
11    private int findFirst(int[] nums, int target) {
12
13        int left = 0, right = nums.length - 1;
14        int ans = -1;
15
16        while (left <= right) {
17
18            int mid = left + (right - left) / 2;
19
20            if (nums[mid] == target) {
21                ans = mid;
22                right = mid - 1; // Search left part
23            } else if (nums[mid] < target) {
24                left = mid + 1;
25            } else {
26                right = mid - 1;
27            }
28        }
29
30        return ans;
31    }
32
33    private int findLast(int[] nums, int target) {
34
35        int left = 0, right = nums.length - 1;
36        int ans = -1;
37
38        while (left <= right) {
39
40            int mid = left + (right - left) / 2;
41
42            if (nums[mid] == target) {
43                ans = mid;
44                left = mid + 1; // Search right part
45            } else if (nums[mid] < target) {
46                left = mid + 1;
47            } else {
48                right = mid - 1;
49            }
50        }
51
52        return ans;
53    }
54}