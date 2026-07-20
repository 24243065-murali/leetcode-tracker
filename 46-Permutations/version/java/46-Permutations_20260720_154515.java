// Last updated: 20/07/2026, 15:45:15
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3
4        List<Integer> result = new ArrayList<>();
5
6        int top = 0;
7        int bottom = matrix.length - 1;
8        int left = 0;
9        int right = matrix[0].length - 1;
10
11        while (top <= bottom && left <= right) {
12
13            // Traverse left to right
14            for (int i = left; i <= right; i++) {
15                result.add(matrix[top][i]);
16            }
17            top++;
18
19            // Traverse top to bottom
20            for (int i = top; i <= bottom; i++) {
21                result.add(matrix[i][right]);
22            }
23            right--;
24
25            // Traverse right to left
26            if (top <= bottom) {
27                for (int i = right; i >= left; i--) {
28                    result.add(matrix[bottom][i]);
29                }
30                bottom--;
31            }
32
33            // Traverse bottom to top
34            if (left <= right) {
35                for (int i = bottom; i >= top; i--) {
36                    result.add(matrix[i][left]);
37                }
38                left++;
39            }
40        }
41
42        return result;
43    }
44}