// Last updated: 05/02/2026, 10:02:51
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            if(num % 3 != 0) ans++;
        }
        return ans;
    }
}
    