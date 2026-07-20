// Last updated: 20/07/2026, 10:27:55
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        if (num1.equals("0") || num2.equals("0")) {
5            return "0";
6        }
7
8        int m = num1.length();
9        int n = num2.length();
10
11        int[] result = new int[m + n];
12
13        for (int i = m - 1; i >= 0; i--) {
14            for (int j = n - 1; j >= 0; j--) {
15
16                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
17
18                int p1 = i + j;
19                int p2 = i + j + 1;
20
21                int sum = mul + result[p2];
22
23                result[p2] = sum % 10;
24                result[p1] += sum / 10;
25            }
26        }
27
28        StringBuilder sb = new StringBuilder();
29
30        for (int num : result) {
31            if (!(sb.length() == 0 && num == 0)) {
32                sb.append(num);
33            }
34        }
35
36        return sb.toString();
37    }
38}