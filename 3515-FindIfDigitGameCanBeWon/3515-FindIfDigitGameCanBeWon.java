// Last updated: 05/02/2026, 10:02:47
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int x:nums){
            if(x<10) sd+=x;
            else dd+=x;

        }
        return sd!=dd;
    }
}