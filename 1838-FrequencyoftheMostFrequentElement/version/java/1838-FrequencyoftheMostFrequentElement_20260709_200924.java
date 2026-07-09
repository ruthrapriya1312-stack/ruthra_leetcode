// Last updated: 09/07/2026, 20:09:24
1import java.util.Arrays;
2
3class Solution {
4    public int maxFrequency(int[] nums, int k) {
5        Arrays.sort(nums);
6        int left = 0, right = 0;
7        int n = nums.length;
8        long sum = 0;  
9
10        while (right < n) {
11            sum += nums[right];
12
13            long requiredSum = (long)nums[right] * (right - left + 1);
14            long diff = requiredSum - sum;
15
16            if (diff > k) {
17                sum -= nums[left];
18                left++;
19            }
20            right++;
21        }
22
23        return right - left;
24    }
25}