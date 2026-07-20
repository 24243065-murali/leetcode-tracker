// Last updated: 20/07/2026, 15:45:41
1class Solution {
2    public int[][] merge(int[][] intervals) {
3
4        // Sort intervals based on starting point
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> result = new ArrayList<>();
8
9        for (int[] interval : intervals) {
10
11            // If result is empty or no overlap
12            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
13                result.add(interval);
14            } else {
15                // Merge overlapping intervals
16                result.get(result.size() - 1)[1] =
17                        Math.max(result.get(result.size() - 1)[1], interval[1]);
18            }
19        }
20
21        return result.toArray(new int[result.size()][]);
22    }
23}