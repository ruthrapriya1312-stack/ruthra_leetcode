// Last updated: 21/06/2026, 08:33:19
1class Solution {
2    public int maxDistance(String moves) {
3        int up = 0, down = 0, left = 0, right = 0, blank = 0;
4        for (char ch : moves.toCharArray())
5        {
6            if (ch == 'U') up++;
7            else if (ch == 'D') down++;
8            else if (ch == 'L') left++;
9            else if (ch == 'R') right++;
10            else if (ch == '_') blank++;
11        }
12        int dx = right - left;
13        int dy = up - down;
14        
15        return Math.abs(dx) +  Math.abs(dy) + blank;
16    }
17}