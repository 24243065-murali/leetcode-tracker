// Last updated: 20/07/2026, 10:17:56
1import java.util.Stack;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5
6        Stack<Integer> stack = new Stack<>();
7        stack.push(-1);
8
9        int maxLength = 0;
10
11        for (int i = 0; i < s.length(); i++) {
12
13            if (s.charAt(i) == '(') {
14                stack.push(i);
15            } else {
16                stack.pop();
17
18                if (stack.isEmpty()) {
19                    stack.push(i);
20                } else {
21                    maxLength = Math.max(maxLength, i - stack.peek());
22                }
23            }
24        }
25
26        return maxLength;
27    }
28}