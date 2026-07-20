// Last updated: 20/07/2026, 15:47:48
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int[][] dp = new int[m][n];
8
9        dp[0][0] = grid[0][0];
10
11        // Fill first row
12        for (int j = 1; j < n; j++) {
13            dp[0][j] = dp[0][j - 1] + grid[0][j];
14        }
15
16        // Fill first column
17        for (int i = 1; i < m; i++) {
18            dp[i][0] = dp[i - 1][0] + grid[i][0];
19        }
20
21        // Fill remaining cells
22        for (int i = 1; i < m; i++) {
23            for (int j = 1; j < n; j++) {
24                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
25            }
26        }
27
28        return dp[m - 1][n - 1];
29    }
30}