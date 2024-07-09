class Solution {
    static int threeSumClosest(int[] array, int target) {
        // code here
        int i=0;
        Arrays.sort(array);
        int n=array.length-1;
        int mini=array[0]+array[1]+array[2];
        while(i<array.length-2){
            int l=i+1,r=n;
            while(l<r){
                int t=array[i]+array[l]+array[r];
                if(Math.abs(t-target)<Math.abs(mini-target)) mini=t;
                else if(Math.abs(t-target)==Math.abs(mini-target)) mini=Math.max(mini,t);
                
                if(t<target) l++;
                else if(t>target){
                    r--;
                }
                else{
                    return mini;
                }
            }
            i++;
        }
        return mini;
    }
}
