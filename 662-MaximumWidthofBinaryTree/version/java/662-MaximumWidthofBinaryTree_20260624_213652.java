// Last updated: 24/06/2026, 21:36:52
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
18    class Node {
19        TreeNode node;
20        int idx;
21        Node(TreeNode node, int idx){
22            this.node = node;
23            this.idx = idx;
24        }
25    }
26    
27    public int widthOfBinaryTree(TreeNode root) {
28        Queue<Node> queue = new LinkedList<>();
29        queue.add(new Node(root,0));
30        int max = 0;
31        while(!queue.isEmpty())
32        {
33            int size = queue.size();
34            int start = 0, end = 0;
35            for(int i=0; i<size; i++)
36            {
37                Node eachNode = queue.remove();
38                int index = eachNode.idx; 
39                if(i==0) 
40                    start = index;
41                if(i==size-1) 
42                    end = index;
43                
44                if(eachNode.node.left!=null)
45                    queue.add(new Node(eachNode.node.left, 2*eachNode.idx));
46
47                if(eachNode.node.right!=null)
48                    queue.add(new Node(eachNode.node.right, 2*eachNode.idx+1));
49                
50            }
51            max = Math.max(max, end - start + 1);
52        }
53        return max;    
54    }
55}