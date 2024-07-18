class Solution {
    public int alternatingMaxLength(int[] arr) {
        // code here
        if(arr.length==0) return 0;
        int n=arr.length;
        int[] inc=new int[n];
        int[] dec=new int[n];
        inc[0]=1;
        dec[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                inc[i]=dec[i-1]+1;
                dec[i]=dec[i-1];    
            }else if(arr[i]<arr[i-1]){
                dec[i]=inc[i-1]+1;
                inc[i]=inc[i-1];
            }else{
                inc[i]=inc[i-1];
                dec[i]=dec[i-1];
            }
        }
        return Math.max(inc[n-1],dec[n-1]);
    }
}
