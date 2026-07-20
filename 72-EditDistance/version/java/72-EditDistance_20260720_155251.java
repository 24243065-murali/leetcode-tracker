// Last updated: 20/07/2026, 15:52:51
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean firstRow = false;
8        boolean firstCol = false;
9
10        for (int i = 0; i < m; i++)
11            if (matrix[i][0] == 0)
12                firstCol = true;
13
14        for (int j = 0; j < n; j++)
15            if (matrix[0][j] == 0)
16                firstRow = true;
17
18        for (int i = 1; i < m; i++) {
19            for (int j = 1; j < n; j++) {
20
21                if (matrix[i][j] == 0) {
22                    matrix[i][0] = 0;
23                    matrix[0][j] = 0;
24                }
25            }
26        }
27
28        for (int i = 1; i < m; i++) {
29            for (int j = 1; j < n; j++) {
30
31                if (matrix[i][0] == 0 || matrix[0][j] == 0)
32                    matrix[i][j] = 0;
33            }
34        }
35
36        if (firstRow) {
37            for (int j = 0; j < n; j++)
38                matrix[0][j] = 0;
39        }
40
41        if (firstCol) {
42            for (int i = 0; i < m; i++)
43                matrix[i][0] = 0;
44        }
45    }
46}