// Last updated: 05/02/2026, 10:03:50
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n  =nums.length;
      Stack<Integer> s = new Stack<>();
      int nextGreater[] = new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty()){
                    nextGreater[i] = -1;
                } else {
                    nextGreater[i] = s.peek();
                }
            }
            s.push(nums[i%n]);
        }
        return nextGreater;
    }
}