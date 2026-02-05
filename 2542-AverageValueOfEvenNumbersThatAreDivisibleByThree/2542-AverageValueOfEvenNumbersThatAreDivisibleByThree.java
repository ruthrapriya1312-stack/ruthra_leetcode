// Last updated: 05/02/2026, 10:03:16
class Solution {
    public int averageValue(int[] nums) {
        // int sum = 0;
        // int count = 0;
        // for (int n : nums) if (n % 6 == 0) { sum += n; count++; }
        // return count == 0 ? 0 : sum / count;
        int sum = 0;
        int count = 0;
        for(int x: nums){
            if(x%2==0 && x%3==0)
            {
                sum+=x;
                count++;
            }
        }
        return count==0?0:sum/count;
    }
}