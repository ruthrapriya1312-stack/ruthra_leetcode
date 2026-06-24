// Last updated: 24/06/2026, 21:28:34
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        List<Integer> list = new ArrayList();
4        while(head != null) {
5            list.add(head.val);
6            head = head.next;
7        }
8        
9        int left = 0;
10        int right = list.size()-1;
11        while(left < right && list.get(left) == list.get(right)) {
12            left++;
13            right--;
14        }
15        return left >= right;
16    }
17}