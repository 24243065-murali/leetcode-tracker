// Last updated: 20/07/2026, 15:54:42
1class Solution {
2
3    public List<List<Integer>> combine(int n, int k) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6        backtrack(1, n, k, new ArrayList<>(), ans);
7        return ans;
8    }
9
10    private void backtrack(int start, int n, int k,
11                           List<Integer> temp,
12                           List<List<Integer>> ans) {
13
14        if (temp.size() == k) {
15            ans.add(new ArrayList<>(temp));
16            return;
17        }
18
19        for (int i = start; i <= n; i++) {
20            temp.add(i);
21            backtrack(i + 1, n, k, temp, ans);
22            temp.remove(temp.size() - 1);
23        }
24    }
25}