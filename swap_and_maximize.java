class Solution {
    public long maxSum(Long[] arr) {
        // code here
        // int n=arr.length;
        // Arrays.sort(arr);
        // int y=arr[1];
        // arr[1]=arr[n-1];
        // arr[n-1]=y;
        // long sum=0;
        // for(long i=0;i<n-1;i++){
        //     sum+=Math.abs(arr[i]-arr[i+1]);
        // }
        // return sum;
        
        // int n=arr.length;
        // Arrays.sort(arr);
        // long sum=0;
        // for(int i=0;i<n-1;i++){
        //     sum+=Math.abs(arr[i]-arr[i+1]);
        // }
        // sum+=Math.abs(arr[n-1]-arr[0]);
        // return sum;
        
        int n=arr.length;
        Arrays.sort(arr);
        Long[] temp=new Long[n];
        long sum=0;
        int left=0, right=n-1;
        for(int i=0; i<n; i++){
            if(i%2==0){
                temp[i]=arr[left++];
            }else{
                temp[i]=arr[right--];
            }
        }
        for(int i=0; i<n; i++){
            sum+=Math.abs(temp[i]-temp[(i+1)%n]);
        }
        return sum;
        
    }
