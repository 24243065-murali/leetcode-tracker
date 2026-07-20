// Last updated: 20/07/2026, 15:46:10
1class Solution {
2    public int lengthOfLastWord(String s) {
3
4        int length = 0;
5        int i = s.length() - 1;
6
7        // Skip trailing spaces
8        while (i >= 0 && s.charAt(i) == ' ') {
9            i--;
10        }
11
12        // Count the characters of the last word
13        while (i >= 0 && s.charAt(i) != ' ') {
14            length++;
15            i--;
16        }
17
18        return length;
19    }
20}