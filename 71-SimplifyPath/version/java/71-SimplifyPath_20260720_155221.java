// Last updated: 20/07/2026, 15:52:21
1class Solution {
2    public String simplifyPath(String path) {
3
4        Deque<String> stack = new ArrayDeque<>();
5
6        for (String dir : path.split("/")) {
7
8            if (dir.equals("") || dir.equals(".")) {
9                continue;
10            }
11
12            if (dir.equals("..")) {
13                if (!stack.isEmpty()) {
14                    stack.pop();
15                }
16            } else {
17                stack.push(dir);
18            }
19        }
20
21        if (stack.isEmpty()) {
22            return "/";
23        }
24
25        StringBuilder result = new StringBuilder();
26
27        while (!stack.isEmpty()) {
28            result.insert(0, "/" + stack.pop());
29        }
30
31        return result.toString();
32    }
33}