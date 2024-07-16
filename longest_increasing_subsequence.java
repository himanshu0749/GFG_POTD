class Solution {
    // Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int a[]) {
        // code here
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++) arr[i]=1;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[j]<a[i]) arr[i]=Math.max(arr[i],arr[j]+1);
            }
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
