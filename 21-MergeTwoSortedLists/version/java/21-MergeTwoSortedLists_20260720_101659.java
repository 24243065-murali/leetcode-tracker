// Last updated: 20/07/2026, 10:16:59
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5
6        List<Integer> result = new ArrayList<>();
7
8        if (s == null || s.length() == 0 || words == null || words.length == 0)
9            return result;
10
11        Map<String, Integer> wordCount = new HashMap<>();
12
13        for (String word : words) {
14            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
15        }
16
17        int wordLen = words[0].length();
18        int totalWords = words.length;
19
20        for (int i = 0; i < wordLen; i++) {
21
22            int left = i;
23            int count = 0;
24
25            Map<String, Integer> window = new HashMap<>();
26
27            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
28
29                String word = s.substring(right, right + wordLen);
30
31                if (wordCount.containsKey(word)) {
32
33                    window.put(word, window.getOrDefault(word, 0) + 1);
34                    count++;
35
36                    while (window.get(word) > wordCount.get(word)) {
37
38                        String leftWord = s.substring(left, left + wordLen);
39
40                        window.put(leftWord, window.get(leftWord) - 1);
41                        left += wordLen;
42                        count--;
43                    }
44
45                    if (count == totalWords) {
46                        result.add(left);
47
48                        String leftWord = s.substring(left, left + wordLen);
49                        window.put(leftWord, window.get(leftWord) - 1);
50                        left += wordLen;
51                        count--;
52                    }
53
54                } else {
55                    window.clear();
56                    count = 0;
57                    left = right + wordLen;
58                }
59            }
60        }
61
62        return result;
63    }
64}