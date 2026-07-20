// Last updated: 20/07/2026, 15:44:11
1class Solution {
2
3    public List<List<String>> solveNQueens(int n) {
4
5        List<List<String>> result = new ArrayList<>();
6
7        char[][] board = new char[n][n];
8
9        // Fill board with '.'
10        for (int i = 0; i < n; i++) {
11            Arrays.fill(board[i], '.');
12        }
13
14        backtrack(board, 0, result);
15
16        return result;
17    }
18
19    private void backtrack(char[][] board, int row,
20                           List<List<String>> result) {
21
22        // All queens placed
23        if (row == board.length) {
24            result.add(createBoard(board));
25            return;
26        }
27
28        for (int col = 0; col < board.length; col++) {
29
30            if (isSafe(board, row, col)) {
31
32                // Place queen
33                board[row][col] = 'Q';
34
35                // Next row
36                backtrack(board, row + 1, result);
37
38                // Remove queen (Backtrack)
39                board[row][col] = '.';
40            }
41        }
42    }
43
44    private boolean isSafe(char[][] board, int row, int col) {
45
46        // Check same column
47        for (int i = 0; i < row; i++) {
48            if (board[i][col] == 'Q')
49                return false;
50        }
51
52        // Check upper-left diagonal
53        for (int i = row - 1, j = col - 1;
54             i >= 0 && j >= 0;
55             i--, j--) {
56
57            if (board[i][j] == 'Q')
58                return false;
59        }
60
61        // Check upper-right diagonal
62        for (int i = row - 1, j = col + 1;
63             i >= 0 && j < board.length;
64             i--, j++) {
65
66            if (board[i][j] == 'Q')
67                return false;
68        }
69
70        return true;
71    }
72
73    private List<String> createBoard(char[][] board) {
74
75        List<String> temp = new ArrayList<>();
76
77        for (char[] row : board) {
78            temp.add(new String(row));
79        }
80
81        return temp;
82    }
83}
84