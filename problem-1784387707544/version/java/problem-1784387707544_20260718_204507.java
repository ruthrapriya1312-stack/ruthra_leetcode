// Last updated: 18/07/2026, 20:45:07
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        int[] freq = new int[26];
4        for(char c: s.toCharArray()){
5            freq[c-'a']++;
6        }
7        StringBuilder ans = new StringBuilder();
8        while (freq[y-'a']-->0){
9            ans.append(y);
10        }
11        for (char c='a';c<='z';c++){
12            if(c==x||c==y)continue;
13            while (freq[c -'a']-->0){
14                ans.append(c);
15            }
16        }
17        while(freq[x-'a']-->0){
18            ans.append(x);
19        }
20        return ans.toString();
21    }
22}