// Last updated: 27/07/2026, 09:02:11
1import java.util.Arrays;
2class Solution {
3    public int[] sortedSquares(int[] arr) {
4
5
6    //  squaring using loop
7        for (int k = 0; k < arr.length; k++) {
8            arr[k] = arr[k] * arr[k];
9        }
10   // sorting
11        Arrays.sort(arr);
12
13        return arr;
14    }
15
16}