// Last updated: 20/07/2026, 10:20:57
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    private boolean solve(char[][] board) {
8
9        for (int row = 0; row < 9; row++) {
10
11            for (int col = 0; col < 9; col++) {
12
13                if (board[row][col] == '.') {
14
15                    for (char num = '1'; num <= '9'; num++) {
16
17                        if (isValid(board, row, col, num)) {
18
19                            board[row][col] = num;
20
21                            if (solve(board)) {
22                                return true;
23                            }
24
25                            // Backtrack
26                            board[row][col] = '.';
27                        }
28                    }
29
30                    return false;
31                }
32            }
33        }
34
35        return true;
36    }
37
38    private boolean isValid(char[][] board, int row, int col, char num) {
39
40        for (int i = 0; i < 9; i++) {
41
42            // Check row
43            if (board[row][i] == num) {
44                return false;
45            }
46
47            // Check column
48            if (board[i][col] == num) {
49                return false;
50            }
51
52            // Check 3x3 box
53            int r = 3 * (row / 3) + i / 3;
54            int c = 3 * (col / 3) + i % 3;
55
56            if (board[r][c] == num) {
57                return false;
58            }
59        }
60
61        return true;
62    }
63}