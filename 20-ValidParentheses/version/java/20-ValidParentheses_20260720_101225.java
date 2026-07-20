// Last updated: 20/07/2026, 10:12:25
1import java.util.Stack;
2
3class Solution {
4    public boolean isValid(String s) {
5        Stack<Character> stack = new Stack<>();
6
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9
10            // Push opening brackets
11            if (ch == '(' || ch == '{' || ch == '[') {
12                stack.push(ch);
13            } 
14            // Handle closing brackets
15            else {
16                if (stack.isEmpty()) {
17                    return false;
18                }
19
20                char top = stack.pop();
21
22                if (ch == ')' && top != '(') {
23                    return false;
24                }
25
26                if (ch == '}' && top != '{') {
27                    return false;
28                }
29
30                if (ch == ']' && top != '[') {
31                    return false;
32                }
33            }
34        }
35
36        return stack.isEmpty();
37    }
38}