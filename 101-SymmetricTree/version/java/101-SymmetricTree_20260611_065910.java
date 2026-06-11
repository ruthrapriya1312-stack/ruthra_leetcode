// Last updated: 11/06/2026, 06:59:10
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null) return true;
19        
20        return isMirror(root.left, root.right);
21    }
22    
23    public boolean isMirror(TreeNode left, TreeNode right) {
24        
25        if(left == null && right == null)
26            return true;
27        
28        if(left == null || right == null)
29            return false;
30        
31        return (left.val == right.val) &&
32               isMirror(left.left, right.right) &&
33               isMirror(left.right, right.left);
34    }
35}