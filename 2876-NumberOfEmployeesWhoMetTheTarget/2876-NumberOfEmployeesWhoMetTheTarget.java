// Last updated: 05/02/2026, 10:02:57
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    int iCount = 0;
    for(int i = 0; i < hours.length; i++){
        if(hours[i] >= target)
        {iCount++;}}
    return iCount;
}
} 