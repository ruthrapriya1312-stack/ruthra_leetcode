// Last updated: 05/02/2026, 10:03:47
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x =(n^(n>>=1));
        return (x&(x+1))==0?true:false;
    }
}