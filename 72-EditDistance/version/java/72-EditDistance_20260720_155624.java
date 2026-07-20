// Last updated: 20/07/2026, 15:56:24
1class Solution {
2
3    public int largestRectangleArea(int[] heights) {
4
5        Stack<Integer> stack = new Stack<>();
6        int max = 0;
7
8        for (int i = 0; i <= heights.length; i++) {
9
10            int h = (i == heights.length) ? 0 : heights[i];
11
12            while (!stack.isEmpty() &&
13                   h < heights[stack.peek()]) {
14
15                int height = heights[stack.pop()];
16                int width = stack.isEmpty()
17                        ? i
18                        : i - stack.peek() - 1;
19
20                max = Math.max(max, height * width);
21            }
22
23            stack.push(i);
24        }
25
26        return max;
27    }
28}