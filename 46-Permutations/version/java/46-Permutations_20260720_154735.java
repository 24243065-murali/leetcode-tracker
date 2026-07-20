// Last updated: 20/07/2026, 15:47:35
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3
4        int m = obstacleGrid.length;
5        int n = obstacleGrid[0].length;
6
7        // If start or end has an obstacle
8        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
9            return 0;
10        }
11
12        int[][] dp = new int[m][n];
13        dp[0][0] = 1;
14
15        for (int i = 0; i < m; i++) {
16            for (int j = 0; j < n; j++) {
17
18                if (obstacleGrid[i][j] == 1) {
19                    dp[i][j] = 0;
20                } else {
21
22                    if (i > 0)
23                        dp[i][j] += dp[i - 1][j];
24
25                    if (j > 0)
26                        dp[i][j] += dp[i][j - 1];
27                }
28            }
29        }
30
31        return dp[m - 1][n - 1];
32    }
33}