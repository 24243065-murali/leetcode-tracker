// Last updated: 09/07/2026, 10:07:00
class Solution {
    String res = "";

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return res;
    }

    private void expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            if (r - l + 1 > res.length()) {
                res = s.substring(l, r + 1);
            }
            l--;
            r++;
        }
    }
}