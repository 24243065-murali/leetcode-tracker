// Last updated: 20/07/2026, 15:45:55
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        List<int[]> result = new ArrayList<>();
5
6        int i = 0;
7        int n = intervals.length;
8
9        // Add all intervals before newInterval
10        while (i < n && intervals[i][1] < newInterval[0]) {
11            result.add(intervals[i]);
12            i++;
13        }
14
15        // Merge overlapping intervals
16        while (i < n && intervals[i][0] <= newInterval[1]) {
17            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
18            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
19            i++;
20        }
21
22        result.add(newInterval);
23
24        // Add remaining intervals
25        while (i < n) {
26            result.add(intervals[i]);
27            i++;
28        }
29
30        return result.toArray(new int[result.size()][]);
31    }
32}