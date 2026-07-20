// Last updated: 20/07/2026, 10:13:13
1import java.util.*;
2
3class Solution {
4
5    public List<String> generateParenthesis(int n) {
6        List<String> result = new ArrayList<>();
7        backtrack(result, "", 0, 0, n);
8        return result;
9    }
10
11    private void backtrack(List<String> result, String current, int open, int close, int n) {
12
13        // If the current string is complete
14        if (current.length() == 2 * n) {
15            result.add(current);
16            return;
17        }
18
19        // Add an opening parenthesis if possible
20        if (open < n) {
21            backtrack(result, current + "(", open + 1, close, n);
22        }
23
24        // Add a closing parenthesis if it won't make the string invalid
25        if (close < open) {
26            backtrack(result, current + ")", open, close + 1, n);
27        }
28    }
29}