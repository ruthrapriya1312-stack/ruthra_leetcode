// Last updated: 26/07/2026, 08:23:44
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n)return -1;
4        if(s==0)return 0;
5        StringBuilder sb=new StringBuilder();
6        while(n>0){
7            int digit =Math.min(9,s);
8            sb.append(digit);
9            s-=digit;
10            n--;
11        }
12        return Integer.parseInt(sb.toString());
13    }
14}