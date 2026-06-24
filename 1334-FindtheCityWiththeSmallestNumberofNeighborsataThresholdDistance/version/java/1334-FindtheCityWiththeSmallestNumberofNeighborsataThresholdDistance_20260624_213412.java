// Last updated: 24/06/2026, 21:34:12
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        int[][] dist = new int[n][n];
4
5        for (int i = 0; i < n; i++) {
6            Arrays.fill(dist[i], Integer.MAX_VALUE);
7            dist[i][i] = 0;
8        }
9
10        for (int[] edge : edges) {
11            dist[edge[0]][edge[1]] = edge[2];
12            dist[edge[1]][edge[0]] = edge[2];
13        }
14
15        for (int k = 0; k < n; k++) {
16            for (int i = 0; i < n; i++) {
17                for (int j = 0; j < n; j++) {
18                    if (dist[i][k] < Integer.MAX_VALUE && dist[k][j] < Integer.MAX_VALUE) {
19                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
20                    }
21                }
22            }
23        }
24
25        int ansNode = -1;
26        int cityCnt = Integer.MAX_VALUE;
27        for (int i = n - 1; i >= 0; i--) {
28            int cnt = 0;
29            for (int j = 0; j < n; j++) {
30                if (dist[i][j] <= distanceThreshold && i != j) {
31                    cnt++;
32                }
33            }
34
35            if (cnt < cityCnt) {
36                ansNode = i;
37                cityCnt = cnt;
38            }
39        }
40
41        return ansNode;
42    }
43}