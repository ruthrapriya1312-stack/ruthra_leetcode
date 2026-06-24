// Last updated: 24/06/2026, 20:53:16
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        for (int i = 0; i < n - 2; i++) {
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9
10            int left = i + 1;
11            int right = n - 1;
12
13            while (left < right) {
14                int sum = nums[i] + nums[left] + nums[right];
15
16                if (sum == 0) {
17                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
18
19                    left++;
20                    right--;
21
22                    while (left < right && nums[left] == nums[left - 1]) left++;
23                    while (left < right && nums[right] == nums[right + 1]) right--;
24
25                } else if (sum < 0) {
26                    left++;
27                } else {
28                    right--;
29                }
30            }
31        }
32
33        return result;
34    }
35}