class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int min=arr[n-1]-arr[0];
        int h=0,l=0;
        int large=arr[n-1]-k;
        int small=arr[0]+k;
        for(int i=0;i<n-1;i++){
            h=Math.max(large,arr[i]+k);
            l=Math.min(small,arr[i+1]-k);
            if(l<0) continue;
            min=Math.min(min,h-l);
        }
        return min;
    }
}
