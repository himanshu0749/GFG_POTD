class Solution {
    long floorSqrt(long n) {
        // Your code here
        if(n==0 || n==1) return n;
        long low=0,high=n,res=0;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid==n) return mid;
            if(mid*mid<n){
                low=mid+1;
                res=mid;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
