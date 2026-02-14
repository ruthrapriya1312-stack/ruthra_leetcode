// Last updated: 14/02/2026, 20:08:38
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder result = new StringBuilder();
4        for (String word : words){
5            int totalWeight = 0;
6            for(char ch : word.toCharArray()){
7                totalWeight += weights[ch - 'a'];
8                
9            }
10            int modValue = totalWeight % 26;
11            char mappedChar = (char) ('z' - modValue);
12            result.append(mappedChar);
13            
14        }
15        return result.toString();
16        
17    }
18}