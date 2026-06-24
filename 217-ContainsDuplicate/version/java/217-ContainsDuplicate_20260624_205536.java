// Last updated: 24/06/2026, 20:55:36
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set <Integer> set = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        return (nums.length==set.size()) ? false : true;
8    }
9}