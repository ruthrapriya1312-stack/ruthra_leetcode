// Last updated: 24/06/2026, 21:31:22
1class Solution {
2    public boolean Valid(String s1 , String s2){
3        return s2.startsWith(s1) && s2.endsWith(s1);
4    }
5    public int countPrefixSuffixPairs(String[] words) {
6        int cnt = 0 ;
7        for(int i = 0 ; i < words.length-1 ; i++){
8            for(int j = i+1 ;  j < words.length ; j++){
9                if(words[i].length() <= words[j].length()){
10                    if(Valid(words[i] , words[j])){
11                        cnt++;
12                    }
13                }
14
15            }
16        }
17        return cnt;
18    }
19}