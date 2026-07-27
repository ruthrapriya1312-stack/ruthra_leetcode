// Last updated: 27/07/2026, 09:03:09
1
2class Solution {
3    public int totalFruit(int[] fruits) {
4        HashMap<Integer, Integer> map=new HashMap<>();
5        int left=0;
6        int max=0;
7        for(int right=0; right<fruits.length; right++)
8        {
9            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
10            while (map.size() > 2){
11                map.put(fruits[left], map.get(fruits[left])-1);
12                if(map.get(fruits[left])==0){
13                    map.remove(fruits[left]);
14                }
15                left++;
16            }
17            max= Math.max(max, right-left +1);
18            }
19        return max;
20    }
21}