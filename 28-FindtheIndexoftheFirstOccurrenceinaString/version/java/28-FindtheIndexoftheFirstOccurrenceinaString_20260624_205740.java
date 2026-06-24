// Last updated: 24/06/2026, 20:57:40
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (haystack.length() < needle.length()) {
4            return -1;
5        }
6        
7        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
8            if (haystack.substring(i, i + needle.length()).equals(needle)) {
9                return i;
10            }
11        }
12        
13        return -1;        
14    }
15}