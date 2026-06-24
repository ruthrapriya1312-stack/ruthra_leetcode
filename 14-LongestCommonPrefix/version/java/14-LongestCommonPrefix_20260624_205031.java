// Last updated: 24/06/2026, 20:50:31
1class Solution {
2    public String longestCommonPrefix(String[] s) {
3        int n = s[0].length();
4
5        for (int i = 1; i < s.length; i++) {
6            int t = s[i].length();
7
8            if (n > t) {
9                n = t;
10            }
11        }
12
13        int k = 0;
14        String a = "";
15        int o = 0;
16
17        while (k < n) {
18            char h = s[0].charAt(k);
19            o = 0;
20
21            for (int i = 1; i < s.length; i++) {
22                if (h != s[i].charAt(k)) {
23                    o = 1;
24                    break;
25                }
26            }
27
28            if (o == 0)
29                a += h;
30            else
31                return a;
32
33            k++;
34        }
35
36        return a;
37    }
38}