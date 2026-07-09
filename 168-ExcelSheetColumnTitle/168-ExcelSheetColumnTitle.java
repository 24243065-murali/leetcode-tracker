// Last updated: 09/07/2026, 10:06:45
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // shift to 0-based index
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}