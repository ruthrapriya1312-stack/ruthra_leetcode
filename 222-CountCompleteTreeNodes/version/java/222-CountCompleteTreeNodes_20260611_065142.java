// Last updated: 11/06/2026, 06:51:42
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
17    public int countNodes(TreeNode root) {
18         if(root == null){
19            return 0;
20        }
21        int leftAns = countNodes(root.left);
22        int rightAns = countNodes(root.right);
23
24        return leftAns + rightAns + 1;
25        
26    }
27}