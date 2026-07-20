// Last updated: 20/07/2026, 15:54:31
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length()) return "";
5
6        int[] map = new int[128];
7
8        for (char c : t.toCharArray())
9            map[c]++;
10
11        int left = 0, right = 0;
12        int count = t.length();
13        int minLen = Integer.MAX_VALUE;
14        int start = 0;
15
16        while (right < s.length()) {
17
18            if (map[s.charAt(right)]-- > 0)
19                count--;
20
21            right++;
22
23            while (count == 0) {
24
25                if (right - left < minLen) {
26                    minLen = right - left;
27                    start = left;
28                }
29
30                if (++map[s.charAt(left)] > 0)
31                    count++;
32
33                left++;
34            }
35        }
36
37        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
38    }
39}