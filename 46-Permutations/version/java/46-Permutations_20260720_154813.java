// Last updated: 20/07/2026, 15:48:13
1class Solution {
2    public boolean isNumber(String s) {
3
4        s = s.trim();
5
6        boolean seenDigit = false;
7        boolean seenDot = false;
8        boolean seenExponent = false;
9
10        for (int i = 0; i < s.length(); i++) {
11
12            char c = s.charAt(i);
13
14            if (Character.isDigit(c)) {
15                seenDigit = true;
16            }
17            else if (c == '+' || c == '-') {
18
19                // Sign is valid only at the beginning
20                // or immediately after e/E
21                if (i > 0 &&
22                    s.charAt(i - 1) != 'e' &&
23                    s.charAt(i - 1) != 'E') {
24                    return false;
25                }
26
27            }
28            else if (c == '.') {
29
30                // Only one decimal point and
31                // not after exponent
32                if (seenDot || seenExponent) {
33                    return false;
34                }
35
36                seenDot = true;
37            }
38            else if (c == 'e' || c == 'E') {
39
40                // Only one exponent and
41                // digits must exist before exponent
42                if (seenExponent || !seenDigit) {
43                    return false;
44                }
45
46                seenExponent = true;
47                seenDigit = false; // Must have digits after exponent
48            }
49            else {
50                return false;
51            }
52        }
53
54        return seenDigit;
55    }
56}