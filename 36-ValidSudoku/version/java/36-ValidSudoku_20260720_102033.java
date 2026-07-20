// Last updated: 20/07/2026, 10:20:33
1import java.util.HashSet;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5
6        HashSet<String> set = new HashSet<>();
7
8        for (int i = 0; i < 9; i++) {
9
10            for (int j = 0; j < 9; j++) {
11
12                char num = board[i][j];
13
14                if (num == '.') {
15                    continue;
16                }
17
18                if (!set.add(num + " in row " + i) ||
19                    !set.add(num + " in col " + j) ||
20                    !set.add(num + " in box " + (i / 3) + "-" + (j / 3))) {
21                    return false;
22                }
23            }
24        }
25
26        return true;
27    }
28}
29