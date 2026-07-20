// Last updated: 20/07/2026, 15:54:55
1class Solution {
2
3    public List<List<Integer>> subsets(int[] nums) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6        backtrack(0, nums, new ArrayList<>(), ans);
7        return ans;
8    }
9
10    private void backtrack(int index, int[] nums,
11                           List<Integer> temp,
12                           List<List<Integer>> ans) {
13
14        ans.add(new ArrayList<>(temp));
15
16        for (int i = index; i < nums.length; i++) {
17            temp.add(nums[i]);
18            backtrack(i + 1, nums, temp, ans);
19            temp.remove(temp.size() - 1);
20        }
21    }
22}