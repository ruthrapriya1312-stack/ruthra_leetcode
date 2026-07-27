// Last updated: 27/07/2026, 09:05:25
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
17
18    private int postIdx;
19    private HashMap<Integer, Integer> map;
20
21    public TreeNode buildTree(int[] inorder, int[] postorder) {
22        map = new HashMap<>();
23
24        for (int i = 0; i < inorder.length; i++) {
25            map.put(inorder[i], i);
26        }
27
28        postIdx = postorder.length - 1;
29        return build(postorder, 0, inorder.length - 1);
30    }
31
32    private TreeNode build(int[] postorder, int left, int right) {
33        if (left > right) {
34            return null;
35        }
36
37        int rootVal = postorder[postIdx--];
38        TreeNode root = new TreeNode(rootVal);
39
40        int mid = map.get(rootVal);
41
42        root.right = build(postorder, mid + 1, right);
43        root.left = build(postorder, left, mid - 1);
44
45        return root;
46    }
47}