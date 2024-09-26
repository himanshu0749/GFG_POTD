class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int i=0;
        int c=0,m=0;
        while(i<(arr.length-1)){
            if(arr[i]<arr[i+1]) c+=1;
            else{
                m=Math.max(m,c);
                c=0;
            }
            i++;
        }
        m=Math.max(m,c);
        return m;
    }
}
