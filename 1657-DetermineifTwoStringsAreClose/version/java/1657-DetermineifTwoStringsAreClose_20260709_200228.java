// Last updated: 09/07/2026, 20:02:28
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if (word1.length() != word2.length()) return false;
4
5        int[] freq1 = new int[26];
6        int[] freq2 = new int[26];
7
8        for (char ch : word1.toCharArray()) {
9            freq1[ch - 'a']++;
10        }
11
12        for (char ch : word2.toCharArray()) {
13            freq2[ch - 'a']++;
14        }
15
16        for (int i = 0; i < 26; i++) {
17            if ((freq1[i] == 0) != (freq2[i] == 0)) {
18                return false;
19            }
20        }
21
22        Arrays.sort(freq1);
23        Arrays.sort(freq2);
24
25        return Arrays.equals(freq1, freq2);
26    }
27}