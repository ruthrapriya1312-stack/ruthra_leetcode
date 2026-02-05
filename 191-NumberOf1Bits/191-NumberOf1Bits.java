// Last updated: 05/02/2026, 10:04:06
class Solution {
    public int hammingWeight(int n) {
       int count = 0;
    while (n!=0){
        n = (n&(n-1));
        count++;
    }        
    return count;
    }
}