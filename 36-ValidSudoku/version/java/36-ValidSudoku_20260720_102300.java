// Last updated: 20/07/2026, 10:23:00
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
6
7        List<List<Integer>> result = new ArrayList<>();
8
9        Arrays.sort(candidates);
10
11        backtrack(candidates, target, 0, new ArrayList<>(), result);
12
13        return result;
14    }
15
16    private void backtrack(int[] candidates, int target, int start,
17                           List<Integer> current,
18                           List<List<Integer>> result) {
19
20        if (target == 0) {
21            result.add(new ArrayList<>(current));
22            return;
23        }
24
25        if (target < 0) {
26            return;
27        }
28
29        for (int i = start; i < candidates.length; i++) {
30
31            // Skip duplicate numbers
32            if (i > start && candidates[i] == candidates[i - 1]) {
33                continue;
34            }
35
36            if (candidates[i] > target) {
37                break;
38            }
39
40            current.add(candidates[i]);
41
42            // i + 1 because each element can be used only once
43            backtrack(candidates, target - candidates[i], i + 1, current, result);
44
45            // Backtrack
46            current.remove(current.size() - 1);
47        }
48    }
49}