// Last updated: 20/07/2026, 15:56:37
1class Solution {
2
3    public int maximalRectangle(char[][] matrix) {
4
5        if (matrix.length == 0)
6            return 0;
7
8        int[] heights = new int[matrix[0].length];
9        int max = 0;
10
11        for (char[] row : matrix) {
12
13            for (int i = 0; i < row.length; i++) {
14
15                if (row[i] == '1')
16                    heights[i]++;
17                else
18                    heights[i] = 0;
19            }
20
21            max = Math.max(max, largestRectangleArea(heights));
22        }
23
24        return max;
25    }
26
27    private int largestRectangleArea(int[] heights) {
28
29        Stack<Integer> stack = new Stack<>();
30        int max = 0;
31
32        for (int i = 0; i <= heights.length; i++) {
33
34            int h = (i == heights.length) ? 0 : heights[i];
35
36            while (!stack.isEmpty() &&
37                    h < heights[stack.peek()]) {
38
39                int height = heights[stack.pop()];
40                int width = stack.isEmpty()
41                        ? i
42                        : i - stack.peek() - 1;
43
44                max = Math.max(max, height * width);
45            }
46
47            stack.push(i);
48        }
49
50        return max;
51    }
52}