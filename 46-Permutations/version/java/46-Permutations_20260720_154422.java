// Last updated: 20/07/2026, 15:44:22
1class Solution {
2
3    private int count = 0;
4
5    public int totalNQueens(int n) {
6
7        char[][] board = new char[n][n];
8
9        for (int i = 0; i < n; i++) {
10            Arrays.fill(board[i], '.');
11        }
12
13        backtrack(board, 0);
14
15        return count;
16    }
17
18    private void backtrack(char[][] board, int row) {
19
20        // Found one valid arrangement
21        if (row == board.length) {
22            count++;
23            return;
24        }
25
26        for (int col = 0; col < board.length; col++) {
27
28            if (isSafe(board, row, col)) {
29
30                board[row][col] = 'Q';
31
32                backtrack(board, row + 1);
33
34                // Backtrack
35                board[row][col] = '.';
36            }
37        }
38    }
39
40    private boolean isSafe(char[][] board, int row, int col) {
41
42        // Check column
43        for (int i = 0; i < row; i++) {
44            if (board[i][col] == 'Q')
45                return false;
46        }
47
48        // Check upper-left diagonal
49        for (int i = row - 1, j = col - 1;
50             i >= 0 && j >= 0;
51             i--, j--) {
52
53            if (board[i][j] == 'Q')
54                return false;
55        }
56
57        // Check upper-right diagonal
58        for (int i = row - 1, j = col + 1;
59             i >= 0 && j < board.length;
60             i--, j++) {
61
62            if (board[i][j] == 'Q')
63                return false;
64        }
65
66        return true;
67    }
68}