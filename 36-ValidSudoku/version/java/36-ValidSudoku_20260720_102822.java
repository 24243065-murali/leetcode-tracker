// Last updated: 20/07/2026, 10:28:22
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4        int i = 0;      // Pointer for s
5        int j = 0;      // Pointer for p
6        int star = -1;  // Last '*' position in p
7        int match = 0;  // Position in s after '*'
8
9        while (i < s.length()) {
10
11            // Characters match or '?'
12            if (j < p.length() &&
13                (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
14                i++;
15                j++;
16            }
17
18            // Found '*'
19            else if (j < p.length() && p.charAt(j) == '*') {
20                star = j;
21                match = i;
22                j++;
23            }
24
25            // Backtrack to previous '*'
26            else if (star != -1) {
27                j = star + 1;
28                match++;
29                i = match;
30            }
31
32            // No match
33            else {
34                return false;
35            }
36        }
37
38        // Skip remaining '*'
39        while (j < p.length() && p.charAt(j) == '*') {
40            j++;
41        }
42
43        return j == p.length();
44    }
45}