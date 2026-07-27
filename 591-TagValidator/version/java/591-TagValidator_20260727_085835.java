// Last updated: 27/07/2026, 08:58:35
1class Solution {
2    public boolean isValid(String code) {
3        Stack<String> st = new Stack<>();
4
5        for(int i = 0; i < code.length(); ++i){
6            if(i > 0 && st.isEmpty()){
7                return false;
8            } 
9
10            if(code.startsWith("<![CDATA[", i)){
11                i = code.indexOf("]]>", i+9);
12                if(i < 0){
13                    return false;
14                }
15                i += 2;
16            } else if(code.startsWith("</", i)){
17                int j = i + 2;
18                i = code.indexOf(">", j);
19                if(i < 0){
20                    return false;
21                }
22                String tag = code.substring(j, i);
23                if(!isValidTag(tag) || st.isEmpty() || !st.pop().equals(tag)){
24                    return false;
25                }
26            } else if(code.startsWith("<", i)) {
27                int j = i + 1;
28                i = code.indexOf(">", j);
29                if(i < 0){
30                    return false;
31                }
32                String tag = code.substring(j, i);
33                if(!isValidTag(tag)){
34                    return false;
35                }
36                st.push(tag);
37            }
38        }
39
40        return st.isEmpty();
41    }
42
43    private boolean isValidTag(String tag){
44        int length = tag.length();
45
46        if(length < 1 || length > 9){
47            return false;
48        }
49        for(char ch : tag.toCharArray()){
50            if(!Character.isUpperCase(ch)){
51                return false;
52            }
53        }
54        return true;
55    }
56}