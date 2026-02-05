// Last updated: 05/02/2026, 10:03:03
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if((arrivalTime+delayedTime)<24){
            return arrivalTime+delayedTime;
        }
        else
        {
            return(arrivalTime+delayedTime)%24;

        }
    }
}