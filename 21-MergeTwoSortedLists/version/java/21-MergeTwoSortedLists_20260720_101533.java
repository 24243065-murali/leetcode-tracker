// Last updated: 20/07/2026, 10:15:33
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        int n = haystack.length();
5        int m = needle.length();
6
7        if (m == 0) {
8            return 0;
9        }
10
11        for (int i = 0; i <= n - m; i++) {
12
13            int j = 0;
14
15            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
16                j++;
17            }
18
19            if (j == m) {
20                return i;
21            }
22        }
23
24        return -1;
25    }
26}