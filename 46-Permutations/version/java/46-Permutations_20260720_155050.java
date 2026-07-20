// Last updated: 20/07/2026, 15:50:50
1class Solution {
2    public int climbStairs(int n) {
3
4        if (n <= 2) {
5            return n;
6        }
7
8        int first = 1;
9        int second = 2;
10
11        for (int i = 3; i <= n; i++) {
12            int current = first + second;
13            first = second;
14            second = current;
15        }
16
17        return second;
18    }
19}