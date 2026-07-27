// Last updated: 27/07/2026, 08:54:14
1class Solution {
2    int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { -1, 1 }, { -1, -1 }, { 1, -1 },
3            { 0, 0 } };
4
5    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
6        int[] res = new int[queries.length];
7
8        Map<Integer, Integer> row = new HashMap<>();
9        Map<Integer, Integer> col = new HashMap<>();
10        Map<Integer, Integer> d1 = new HashMap<>();
11        Map<Integer, Integer> d2 = new HashMap<>();
12        Map<Integer, Boolean> cellNo = new HashMap<>();
13
14        for (int i = 0; i < lamps.length; i++) {
15            int r = lamps[i][0];
16            int c = lamps[i][1];
17            if (!cellNo.containsKey(N * r + c)) {
18                row.put(r, row.getOrDefault(r, 0) + 1);
19                col.put(c, col.getOrDefault(c, 0) + 1);
20                d1.put(r - c, d1.getOrDefault(r - c, 0) + 1);
21                d2.put(r + c, d2.getOrDefault(r + c, 0) + 1);
22                cellNo.put(N * r + c, true);
23            }
24        }
25
26        for (int i = 0; i < queries.length; i++) {
27            int r = queries[i][0];
28            int c = queries[i][1];
29
30            res[i] = (row.getOrDefault(r, 0) > 0 || col.getOrDefault(c, 0) > 0 || d1.getOrDefault(r - c, 0) > 0
31                    || d2.getOrDefault(r + c, 0) > 0) ? 1 : 0;
32
33            // switch off the lamps, if any
34
35            for (int[] d : dir) {
36                int r1 = r + d[0], c1 = c + d[1];
37                if (r1 >= 0 && r1 < N && c1 >= 0 && c1 < N)
38                    if (cellNo.containsKey(N * r1 + c1) && cellNo.get(N * r1 + c1)) {
39
40                        // the lamp is on, turn it off, so decrement the count of the lamps
41
42                        row.put(r1, row.getOrDefault(r1, 1) - 1);
43                        col.put(c1, col.getOrDefault(c1, 1) - 1);
44                        d1.put(r1 - c1, d1.getOrDefault(r1 - c1, 1) - 1);
45                        d2.put(r1 + c1, d2.getOrDefault(r1 + c1, 1) - 1);
46                        cellNo.put(N * r1 + c1, false);
47                    }
48            }
49
50        }
51        return res;
52    }
53
54}