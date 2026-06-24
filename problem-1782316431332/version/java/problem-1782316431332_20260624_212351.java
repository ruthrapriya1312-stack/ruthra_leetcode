// Last updated: 24/06/2026, 21:23:51
1class Solution {
2       public static int[] intersection(int[] nums1, int[] nums2)
3    {
4        HashSet<Integer> set1 = new HashSet<>();
5        HashSet<Integer> set2 = new HashSet<>();
6
7        for (int n : nums1) {
8            set1.add(n);
9        }
10
11        for (int n : nums2) {
12            if (set1.contains(n))
13                set2.add(n);
14        }
15
16        int [] result = new int[set2.size()];
17            int index = 0;
18        for (int n : set2){
19            result[index++] = n;
20        }
21        
22        return result;
23    }
24
25}