// Last updated: 27/07/2026, 08:59:43
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int n = weights.length;
4        int max = 0;
5        for(int i:weights) max = Math.max(max,i);
6        int l = max,h = Integer.MAX_VALUE,ans = Integer.MAX_VALUE;
7        while(l<=h){
8            int capacity = l+(h-l)/2;
9            int totalDays= 1;
10            int cur = capacity;
11            for(int i=0;i<n;i++){
12                if(cur<weights[i]){
13                    totalDays++;
14                    cur = capacity;
15                }
16                cur-=weights[i];
17            }
18            if(totalDays<=days){
19                ans=capacity;
20                h=capacity-1;
21            }
22            else l = capacity+1;
23        }
24        return ans;
25    }
26}