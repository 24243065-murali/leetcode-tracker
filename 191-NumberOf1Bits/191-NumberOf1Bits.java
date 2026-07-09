// Last updated: 09/07/2026, 10:06:17
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}