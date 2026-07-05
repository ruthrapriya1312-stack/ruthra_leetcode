// Last updated: 05/07/2026, 08:32:55
1class Solution {
2    public int maxDigitRange(int[] nums) {
3        int maxRange = -1;
4        for(int num:nums){
5            int range = digitRange(num);
6            maxRange = Math.max(maxRange,range);
7        }
8        int sum = 0;for(int num:nums){
9            if(digitRange(num)==maxRange){
10                sum +=num;
11            }
12        }
13        return sum;
14    }
15    private int digitRange(int num){
16        int maxDigit=0;
17        int minDigit=9;
18        while(num>0){
19            int digit = num%10;
20            maxDigit = Math.max(maxDigit,digit);
21            minDigit = Math.min(minDigit,digit);
22            num/=10;
23        }
24        return maxDigit-minDigit;
25    }
26}