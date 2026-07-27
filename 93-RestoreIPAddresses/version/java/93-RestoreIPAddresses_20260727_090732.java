// Last updated: 27/07/2026, 09:07:32
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> ans = new LinkedList<>();
4        // Call the helper method with the input string, the ans list, a counter initialized to 0, and empty strings for the current decimal and current IP address
5        helper(s,ans,0,"","");
6        return ans;
7    }
8
9    public void helper(String s, List<String> ans, int dec, String r ,String a){
10        if(r.length()>2 && Integer.parseInt(r)>255)return;
11        // If the number of parts in the current IP address is greater than 4, return
12        if(dec>4) return;
13        // If the current decimal String has more than 1 digit and starts with 0, return
14        if(r.length()>1 && Integer.parseInt(r.charAt(0)+"")==0)return;
15        // Concatenate the current decimal to the current IP address
16        a+=r;
17        // If the number of decimals is 4 and the input string is empty, add the current IP address to the list of valid IP addresses
18        if(dec==4 && s.length()==0)ans.add(a);
19        // If the current decimal is not empty, add a period to the current IP address
20        if(r.length()>0)a+=".";
21        // Recursively call the helper method with various substrings of the input string, incremented counter and the current IP address
22        if(s.length()>0) helper(s.substring(1,s.length()),ans,dec+1,s.substring(0,1),a);
23        if(s.length()>1) helper(s.substring(2,s.length()),ans,dec+1,s.substring(0,2),a);
24        if(s.length()>2) helper(s.substring(3,s.length()),ans,dec+1,s.substring(0,3),a);
25    }
26}