// Last updated: 14/02/2026, 20:17:25
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3       HashMap<String, Integer> map = new HashMap<>();
4        for(String word : words){
5            if (word.length() >=k){
6                String prefix = word.substring(0,k);
7                map.put(prefix,map.getOrDefault(prefix,0)+1);
8                
9            }
10        }
11        int count = 0;
12        for(int freq : map.values()){
13            if (freq >=2){
14                count++;
15            }
16        }
17        return count;
18    }
19}