// Last updated: 05/02/2026, 10:02:40
class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = nums.length - 1;i>= 0;i--){
            if(!s.add(nums[i]))return i/3+1;
        }
        return 0;
        
    }
}