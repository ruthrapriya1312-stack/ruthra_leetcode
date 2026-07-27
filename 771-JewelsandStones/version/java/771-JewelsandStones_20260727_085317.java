// Last updated: 27/07/2026, 08:53:17
1class Solution {
2    public int numJewelsInStones(String jew, String st) {
3        int cnt = 0;
4        for(int i = 0 ; i < jew.length() ; i++){
5            char ch = jew.charAt(i);
6            for(int j = 0 ; j < st.length() ; j++){
7                if(ch == st.charAt(j))cnt++;
8            }
9        }
10        return cnt;
11    }
12}