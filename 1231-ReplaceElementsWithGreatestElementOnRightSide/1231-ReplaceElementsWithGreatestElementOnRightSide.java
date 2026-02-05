// Last updated: 05/02/2026, 10:03:38

class Solution {
    public int[] replaceElements(int[] arr) {
        // int maxRight = -1;
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     int temp = arr[i];       
        //     arr[i] = maxRight;       
        //     maxRight = Math.max(maxRight, temp); 
        // }
        // return arr;
        for(int i=0;i<arr.length;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max) max=arr[j];
        }
        arr[i]=max;
    }
    return arr;
}

} 

    
