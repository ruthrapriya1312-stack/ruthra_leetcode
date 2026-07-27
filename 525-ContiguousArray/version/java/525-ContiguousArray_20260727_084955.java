// Last updated: 27/07/2026, 08:49:55
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int sum=0;
4        int maxLen=0;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        map.put(0,-1);
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==1) sum+=1;
9            else sum-=1;
10            if(map.containsKey(sum)){
11                maxLen=Math.max(maxLen,i-map.get(sum));
12            }
13            else{
14                map.put(sum,i);
15            }
16        }
17        return maxLen;
18    }
19}