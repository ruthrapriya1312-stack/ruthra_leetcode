// Last updated: 05/02/2026, 10:03:06
class Solution {
    public int passThePillow(int n, int time) {
        int cycle= time/(n-1);
       int  remain = time%(n-1);
        if ( cycle%2 == 1)
        { 
            return n-remain;

        }else
        {
             return remain +1;
        }
    }
}