// Last updated: 05/02/2026, 10:03:30
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD = empty/NE;
            empty = (empty%NE)+newD;
            drink+=newD;
        }
        return drink;
    }
}