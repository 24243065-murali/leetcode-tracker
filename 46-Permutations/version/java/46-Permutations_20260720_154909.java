// Last updated: 20/07/2026, 15:49:09
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3
4        List<String> result = new ArrayList<>();
5        int i = 0;
6
7        while (i < words.length) {
8
9            int lineLength = words[i].length();
10            int j = i + 1;
11
12            // Find how many words fit in one line
13            while (j < words.length &&
14                    lineLength + 1 + words[j].length() <= maxWidth) {
15                lineLength += 1 + words[j].length();
16                j++;
17            }
18
19            StringBuilder line = new StringBuilder();
20            int gaps = j - i - 1;
21
22            // Last line or only one word
23            if (j == words.length || gaps == 0) {
24
25                for (int k = i; k < j; k++) {
26                    line.append(words[k]);
27
28                    if (k != j - 1) {
29                        line.append(" ");
30                    }
31                }
32
33                while (line.length() < maxWidth) {
34                    line.append(" ");
35                }
36
37            } else {
38
39                int totalChars = 0;
40
41                for (int k = i; k < j; k++) {
42                    totalChars += words[k].length();
43                }
44
45                int totalSpaces = maxWidth - totalChars;
46                int spaceEach = totalSpaces / gaps;
47                int extra = totalSpaces % gaps;
48
49                for (int k = i; k < j; k++) {
50
51                    line.append(words[k]);
52
53                    if (k != j - 1) {
54
55                        for (int s = 0; s < spaceEach; s++) {
56                            line.append(" ");
57                        }
58
59                        if (extra > 0) {
60                            line.append(" ");
61                            extra--;
62                        }
63                    }
64                }
65            }
66
67            result.add(line.toString());
68            i = j;
69        }
70
71        return result;
72    }
73}