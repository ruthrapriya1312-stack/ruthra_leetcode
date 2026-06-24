// Last updated: 24/06/2026, 20:49:42
1class Solution {
2    public String longestPalindrome(String s) {
3        int len = s.length();
4
5        if (len == 0) {
6            return "";
7        }
8
9        char[] sChars = s.toCharArray();
10
11        /*
12         * length of common string found
13         * set dp[i][j] to 0 if s[i - 1] != s[j];
14         */
15        int[][] dp = new int[2][len + 1];
16        int currRow = 0;
17        int maxLen = 0;
18        int start = 0;
19
20        /*
21         * find longest common string between s and s' (reversed s)
22         * for orginal string, from sChars[0] to sChars[len - 1]
23         * for reversed view, from sChars[len - 1] to sChars[0];
24         */
25        for (int i = 0; i <= len; i++) {
26            for (int j = len; j >= 0; j--) {
27                if (i == 0 || j == len) {
28                    dp[currRow][j] = 0;
29                } else if (sChars[i - 1] == sChars[j]) {
30                    dp[currRow][j] = dp[1 - currRow][j + 1] + 1;
31                    int currLen = dp[currRow][j];
32
33                    /*
34                     * 1. longest common substring length
35                     * 2. skip those common substrings doesn't "produced" by reverse.
36                     */
37                    if (i - 1 == j + currLen - 1 && i - currLen == j && currLen > maxLen) {
38                        start = j;
39                        maxLen = currLen;
40                    }
41                } else {
42                    dp[currRow][j] = 0;
43                }
44            }
45
46            // * switch the working row of dp[][] to the next row (i)
47            currRow = 1 - currRow;
48        }
49
50        return s.substring(start, start + maxLen);
51    }
52}