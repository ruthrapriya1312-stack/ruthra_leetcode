// Last updated: 15/02/2026, 08:20:57
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        Set<Integer>onBulbs = new HashSet<>();
4        for (int bulb:bulbs){
5            if (onBulbs.contains(bulb))
6            {
7                onBulbs.remove(bulb);
8                
9            }else{
10                onBulbs.add(bulb);
11                
12            }
13        }
14        List<Integer > result = new ArrayList(onBulbs);
15        Collections.sort(result);
16        return result;
17    }
18}