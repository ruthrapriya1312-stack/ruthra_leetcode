// Last updated: 05/02/2026, 10:02:43
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        long[] suffixMin = new long[n];
        suffixMin[n-1] = nums[n-1];
        for(int i =n-2;i>=0;i--)
            {
                suffixMin[i] = Math.min(nums[i],suffixMin[i + 1]);
            }
        long maxScore =  Long.MIN_VALUE;
        for (int i =0; i<n-1;i++)
            {
                long score = prefix[i] -suffixMin[i+1];
                maxScore = Math.max(maxScore,score );
            }
        return maxScore;  
    }
}