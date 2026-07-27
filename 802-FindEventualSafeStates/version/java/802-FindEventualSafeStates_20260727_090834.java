// Last updated: 27/07/2026, 09:08:34
1class Solution {
2
3    public boolean dfs(int i, int[] visited, int[]dfs_vis, boolean[]safe, int[][]graph)
4    {
5        visited[i]=1;
6        dfs_vis[i]=1;
7
8        int[] neigh=graph[i];
9
10        for(int j: neigh)
11        {
12            if(visited[j]==-1)
13            {
14                if(dfs(j, visited, dfs_vis, safe, graph))
15                {
16                    safe[i]=true;
17                    return true;
18                }
19            }
20            else if(visited[j]==1 && dfs_vis[j]==1)
21                {
22                    safe[i]=true;
23                    return true;
24                }
25        }
26
27        dfs_vis[i]=-1;
28
29        return false;
30    }
31    public List<Integer> eventualSafeNodes(int[][] graph) {
32        
33        int n=graph.length;
34
35        int[] visited=new int[n];
36        int[] dfs_vis=new int[n];
37        boolean[] safe=new boolean[n];
38
39        for(int i=0; i<n; i++)
40        {
41            visited[i]=-1;
42            dfs_vis[i]=-1;
43            safe[i]=false;
44        }
45
46        for(int i=0; i<n; i++)
47        {
48            if(visited[i]==-1)
49            {
50                dfs(i, visited, dfs_vis, safe, graph);
51            }
52        }
53
54        List<Integer> ans= new ArrayList<>();
55
56        for(int i=0; i<n; i++)
57        {
58            if(safe[i]==false)
59            {
60                ans.add(i);
61            }
62        }
63
64        return ans;
65    }
66}