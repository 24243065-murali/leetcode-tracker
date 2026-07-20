// Last updated: 20/07/2026, 15:47:15
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[][] dp = new int[m][n];
5
6        // First row
7        for (int i = 0; i < n; i++) {
8            dp[0][i] = 1;
9        }
10
11        // First column
12        for (int i = 0; i < m; i++) {
13            dp[i][0] = 1;
14        }
15
16        // Fill remaining cells
17        for (int i = 1; i < m; i++) {
18            for (int j = 1; j < n; j++) {
19                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
20            }
21        }
22
23        return dp[m - 1][n - 1];
24    }
25}