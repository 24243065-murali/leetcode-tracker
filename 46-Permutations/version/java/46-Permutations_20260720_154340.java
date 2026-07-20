// Last updated: 20/07/2026, 15:43:40
1class Solution {
2    public double myPow(double x, int n) {
3
4        long power = n;
5
6        // Handle negative exponent
7        if (power < 0) {
8            x = 1 / x;
9            power = -power;
10        }
11
12        double result = 1.0;
13
14        while (power > 0) {
15
16            // If power is odd
17            if ((power & 1) == 1) {
18                result *= x;
19            }
20
21            // Square the base
22            x *= x;
23
24            // Divide power by 2
25            power >>= 1;
26        }
27
28        return result;
29    }
30}