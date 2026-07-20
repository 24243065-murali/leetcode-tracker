// Last updated: 20/07/2026, 15:42:45
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        Arrays.sort(nums); // Sort to handle duplicates
6
7        boolean[] used = new boolean[nums.length];
8
9        backtrack(nums, used, new ArrayList<>(), result);
10
11        return result;
12    }
13
14    private void backtrack(int[] nums, boolean[] used,
15                           List<Integer> current,
16                           List<List<Integer>> result) {
17
18        // If one permutation is complete
19        if (current.size() == nums.length) {
20            result.add(new ArrayList<>(current));
21            return;
22        }
23
24        for (int i = 0; i < nums.length; i++) {
25
26            // Skip already used elements
27            if (used[i]) {
28                continue;
29            }
30
31            // Skip duplicate elements
32            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
33                continue;
34            }
35
36            // Choose
37            used[i] = true;
38            current.add(nums[i]);
39
40            // Explore
41            backtrack(nums, used, current, result);
42
43            // Backtrack
44            current.remove(current.size() - 1);
45            used[i] = false;
46        }
47    }
48}