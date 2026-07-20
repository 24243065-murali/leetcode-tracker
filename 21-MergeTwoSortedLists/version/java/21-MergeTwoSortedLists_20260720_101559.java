// Last updated: 20/07/2026, 10:15:59
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Handle overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Convert to long to avoid overflow
10        long dvd = Math.abs((long) dividend);
11        long dvs = Math.abs((long) divisor);
12
13        int result = 0;
14
15        while (dvd >= dvs) {
16
17            long temp = dvs;
18            int multiple = 1;
19
20            while (dvd >= (temp << 1)) {
21                temp <<= 1;
22                multiple <<= 1;
23            }
24
25            dvd -= temp;
26            result += multiple;
27        }
28
29        // Apply the correct sign
30        if ((dividend > 0) ^ (divisor > 0)) {
31            return -result;
32        }
33
34        return result;
35    }
36}