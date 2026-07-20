// Last updated: 20/07/2026, 15:43:24
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3
4        Map<String, List<String>> map = new HashMap<>();
5
6        for (String str : strs) {
7
8            // Convert string to character array
9            char[] chars = str.toCharArray();
10
11            // Sort the characters
12            Arrays.sort(chars);
13
14            // Create key
15            String key = new String(chars);
16
17            // Add string to corresponding group
18            map.putIfAbsent(key, new ArrayList<>());
19            map.get(key).add(str);
20        }
21
22        // Return grouped anagrams
23        return new ArrayList<>(map.values());
24    }
25}