// Last updated: 20/07/2026, 15:48:29
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4        // Traverse from the last digit
5        for (int i = digits.length - 1; i >= 0; i--) {
6
7            // If digit is less than 9, increment and return
8            if (digits[i] < 9) {
9                digits[i]++;
10                return digits;
11            }
12
13            // If digit is 9, make it 0 and continue
14            digits[i] = 0;
15        }
16
17        // If all digits were 9, create a new array
18        int[] result = new int[digits.length + 1];
19        result[0] = 1;
20
21        return result;
22    }
23}