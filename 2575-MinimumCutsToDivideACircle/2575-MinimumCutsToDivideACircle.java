// Last updated: 05/02/2026, 10:03:12
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;

    }
}