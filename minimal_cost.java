class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int[] dp=new int[arr.length];
        dp[0]=0;
        //int f=0,s=0;
        for(int i=1;i<arr.length;i++){
            //f=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            // if(i>1){
            //   s=dp[i-1]+Math.abs(arr[i]-arr[i-2]);
            // }
            dp[i]=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int cost=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    dp[i]=Math.min(dp[i],cost);
                }
            }
            // dp[i]=Math.min(f,s);
        }
        return dp[arr.length-1];
    }
}
