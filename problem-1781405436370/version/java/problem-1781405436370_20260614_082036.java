// Last updated: 14/06/2026, 08:20:36
1class Solution {
2    public boolean checkGoodInteger(int n) {
3      int digitSum = 0;
4        int squareSum = 0;
5        while(n>0){
6            int digit = n % 10;
7            digitSum +=digit;    
8            squareSum += digit * digit;
9            n/=10;
10    }
11        return (squareSum - digitSum) >= 50;
12    }
13}