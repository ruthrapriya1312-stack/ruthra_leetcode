// Last updated: 05/02/2026, 10:04:08
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>=5){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}