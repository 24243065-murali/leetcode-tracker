// Last updated: 20/07/2026, 10:22:17
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> combinationSum(int[] candidates, int target) {
6
7        List<List<Integer>> result = new ArrayList<>();
8        backtrack(candidates, target, 0, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(int[] candidates, int target, int index,
13                           List<Integer> current,
14                           List<List<Integer>> result) {
15
16        // Found a valid combination
17        if (target == 0) {
18            result.add(new ArrayList<>(current));
19            return;
20        }
21
22        // Target exceeded
23        if (target < 0) {
24            return;
25        }
26
27        // Try each candidate starting from index
28        for (int i = index; i < candidates.length; i++) {
29
30            current.add(candidates[i]);
31
32            // i (not i + 1), because the same number can be reused
33            backtrack(candidates, target - candidates[i], i, current, result);
34
35            // Backtrack
36            current.remove(current.size() - 1);
37        }
38    }
39}