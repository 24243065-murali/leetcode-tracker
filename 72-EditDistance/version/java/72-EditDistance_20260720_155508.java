// Last updated: 20/07/2026, 15:55:08
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4
5        for (int i = 0; i < board.length; i++) {
6            for (int j = 0; j < board[0].length; j++) {
7
8                if (dfs(board, word, i, j, 0))
9                    return true;
10            }
11        }
12
13        return false;
14    }
15
16    private boolean dfs(char[][] board, String word,
17                        int i, int j, int k) {
18
19        if (k == word.length())
20            return true;
21
22        if (i < 0 || j < 0 ||
23            i >= board.length ||
24            j >= board[0].length ||
25            board[i][j] != word.charAt(k))
26            return false;
27
28        char temp = board[i][j];
29        board[i][j] = '#';
30
31        boolean found =
32            dfs(board, word, i + 1, j, k + 1) ||
33            dfs(board, word, i - 1, j, k + 1) ||
34            dfs(board, word, i, j + 1, k + 1) ||
35            dfs(board, word, i, j - 1, k + 1);
36
37        board[i][j] = temp;
38
39        return found;
40    }
41}