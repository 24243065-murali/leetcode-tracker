// Last updated: 09/07/2026, 10:06:26
import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String seq = s.substring(i, i + 10);

            if (!seen.add(seq)) {
                repeated.add(seq);
            }
        }

        return new ArrayList<>(repeated);
    }
}