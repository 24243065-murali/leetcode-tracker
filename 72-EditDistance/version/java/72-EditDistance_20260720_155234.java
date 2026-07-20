// Last updated: 20/07/2026, 15:52:34
1class Solution {
2    public int minDistance(String word1, String word2) {
3
4        int m = word1.length();
5        int n = word2.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        for (int i = 0; i <= m; i++)
10            dp[i][0] = i;
11
12        for (int j = 0; j <= n; j++)
13            dp[0][j] = j;
14
15        for (int i = 1; i <= m; i++) {
16            for (int j = 1; j <= n; j++) {
17
18                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
19                    dp[i][j] = dp[i - 1][j - 1];
20                } else {
21                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
22                                    Math.min(dp[i - 1][j], dp[i][j - 1]));
23                }
24            }
25        }
26
27        return dp[m][n];
28    }
29}