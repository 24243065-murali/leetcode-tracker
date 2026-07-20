// Last updated: 20/07/2026, 15:42:33
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
5        return result;
6    }
7
8    private void backtrack(int[] nums, List<Integer> current,
9                           boolean[] used, List<List<Integer>> result) {
10
11        // If permutation is complete
12        if (current.size() == nums.length) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        // Try every number
18        for (int i = 0; i < nums.length; i++) {
19
20            // Skip already used numbers
21            if (used[i]) {
22                continue;
23            }
24
25            // Choose
26            used[i] = true;
27            current.add(nums[i]);
28
29            // Explore
30            backtrack(nums, current, used, result);
31
32            // Backtrack
33            current.remove(current.size() - 1);
34            used[i] = false;
35        }
36    }
37}