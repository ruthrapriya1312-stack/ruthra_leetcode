// Last updated: 05/02/2026, 10:04:11
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for(int i =0; i<s.length(); i++){
            res = res * 26 + s.charAt(i) - 64;

        }
        return res;
    }
}