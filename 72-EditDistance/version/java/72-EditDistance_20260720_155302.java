// Last updated: 20/07/2026, 15:53:02
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int left = 0;
8        int right = m * n - 1;
9
10        while (left <= right) {
11
12            int mid = left + (right - left) / 2;
13
14            int value = matrix[mid / n][mid % n];
15
16            if (value == target)
17                return true;
18
19            if (value < target)
20                left = mid + 1;
21            else
22                right = mid - 1;
23        }
24
25        return false;
26    }
27}