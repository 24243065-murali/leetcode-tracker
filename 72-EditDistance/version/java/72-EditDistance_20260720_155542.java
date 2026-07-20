// Last updated: 20/07/2026, 15:55:42
1class Solution {
2
3    public boolean search(int[] nums, int target) {
4
5        int left = 0, right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = (left + right) / 2;
10
11            if (nums[mid] == target)
12                return true;
13
14            if (nums[left] == nums[mid] &&
15                nums[mid] == nums[right]) {
16                left++;
17                right--;
18            }
19            else if (nums[left] <= nums[mid]) {
20
21                if (nums[left] <= target &&
22                    target < nums[mid])
23                    right = mid - 1;
24                else
25                    left = mid + 1;
26
27            } else {
28
29                if (nums[mid] < target &&
30                    target <= nums[right])
31                    left = mid + 1;
32                else
33                    right = mid - 1;
34            }
35        }
36
37        return false;
38    }
39}