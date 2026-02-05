// Last updated: 05/02/2026, 10:04:04
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && ((n&(n-1))==0));

    }
}