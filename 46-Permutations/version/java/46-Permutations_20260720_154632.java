// Last updated: 20/07/2026, 15:46:32
1class Solution {
2    public String getPermutation(int n, int k) {
3
4        List<Integer> numbers = new ArrayList<>();
5        int factorial = 1;
6
7        // Store numbers from 1 to n
8        for (int i = 1; i < n; i++) {
9            factorial *= i;
10            numbers.add(i);
11        }
12        numbers.add(n);
13
14        StringBuilder result = new StringBuilder();
15
16        // Convert k to 0-based index
17        k--;
18
19        while (!numbers.isEmpty()) {
20
21            int index = k / factorial;
22            result.append(numbers.get(index));
23
24            numbers.remove(index);
25
26            if (numbers.isEmpty()) {
27                break;
28            }
29
30            k %= factorial;
31            factorial /= numbers.size();
32        }
33
34        return result.toString();
35    }
36}