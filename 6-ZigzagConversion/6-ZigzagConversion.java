// Last updated: 09/07/2026, 10:06:58
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int i = 0, dir = 1;

        for (char c : s.toCharArray()) {
            rows[i].append(c);

            if (i == 0) dir = 1;
            else if (i == numRows - 1) dir = -1;

            i += dir;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);

        return res.toString();
    }
}