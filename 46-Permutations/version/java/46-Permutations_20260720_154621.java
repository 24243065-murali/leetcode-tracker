// Last updated: 20/07/2026, 15:46:21
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] matrix = new int[n][n];
5
6        int top = 0;
7        int bottom = n - 1;
8        int left = 0;
9        int right = n - 1;
10
11        int num = 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Left to Right
16            for (int i = left; i <= right; i++) {
17                matrix[top][i] = num++;
18            }
19            top++;
20
21            // Top to Bottom
22            for (int i = top; i <= bottom; i++) {
23                matrix[i][right] = num++;
24            }
25            right--;
26
27            // Right to Left
28            if (top <= bottom) {
29                for (int i = right; i >= left; i--) {
30                    matrix[bottom][i] = num++;
31                }
32                bottom--;
33            }
34
35            // Bottom to Top
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    matrix[i][left] = num++;
39                }
40                left++;
41            }
42        }
43
44        return matrix;
45    }
46}