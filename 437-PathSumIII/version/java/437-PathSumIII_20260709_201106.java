// Last updated: 09/07/2026, 20:11:06
1class Solution {
2    private int helper(TreeNode node, long currSum, int targetSum, Map<Long , Integer> prefixMap) {
3        if(node == null) return 0;
4        currSum += node.val;
5        int count = prefixMap.getOrDefault(currSum - targetSum, 0);
6        prefixMap.put(currSum, prefixMap.getOrDefault(currSum, 0) + 1);
7        count += helper(node.left, currSum, targetSum, prefixMap);
8        count += helper(node.right, currSum, targetSum, prefixMap);
9        prefixMap.put(currSum, prefixMap.get(currSum) - 1);
10        return count;
11    }
12
13    public int pathSum(TreeNode root, int targetSum) {
14        Map<Long, Integer> prefixMap = new HashMap<>();
15        prefixMap.put(0L, 1);
16        return helper(root, 0L, targetSum, prefixMap);
17    }
18}