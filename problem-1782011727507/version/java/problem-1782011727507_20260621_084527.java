// Last updated: 21/06/2026, 08:45:27
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3     int n = nums.length;
4        int count = 0;
5
6        for (int i = 0; i<n; i++){
7            long sum = 0;
8
9            for (int j =i; j<n; j++){
10                sum += nums[j];
11
12                if(isValid(sum, x)){
13                    count++;
14                }
15            }
16        }
17        return count;
18    }
19    private boolean isValid(long sum, int x)
20    {
21        int lastDigit = (int)(sum % 10);
22
23        long temp = sum;
24        while (temp >= 10){
25            temp /= 10;
26        }
27        int firstDigit = (int)temp;
28
29        return firstDigit == x && lastDigit == x;
30    }
31}