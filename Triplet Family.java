class Solution {
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            Set<Integer> mp = new HashSet<>();
            for(int j=0; j<n; j++) {
                if(i!=j){ 
                    int find=arr[i]-arr[j];
                    if (mp.contains(find)) return true;
                    mp.add(arr[j]);
                }
            }
        }
        return false;
    }
}
