class Solution {
    int Maximize(int arr[]) {
        int n=arr.length;
        Arrays.sort(arr);
        long sum=0;
        long mod=1000000007;
        for(int i=0;i<n;i++){
            sum=(sum+(arr[i]*(long)i)%mod)%mod;
        }
        return (int)sum;
    }
}
