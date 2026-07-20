// Last updated: 20/07/2026, 10:27:27
1class Solution {
2    public int trap(int[] height) {
3
4        int left = 0;
5        int right = height.length - 1;
6
7        int leftMax = 0;
8        int rightMax = 0;
9
10        int water = 0;
11
12        while (left < right) {
13
14            if (height[left] < height[right]) {
15
16                if (height[left] >= leftMax) {
17                    leftMax = height[left];
18                } else {
19                    water += leftMax - height[left];
20                }
21
22                left++;
23            } else {
24
25                if (height[right] >= rightMax) {
26                    rightMax = height[right];
27                } else {
28                    water += rightMax - height[right];
29                }
30
31                right--;
32            }
33        }
34
35        return water;
36    }
37}