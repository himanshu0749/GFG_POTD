-------------------------O(N)-----------------------------------
HashMap<Integer, Integer> firstIndex = new HashMap<>();
        int maxDist = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!firstIndex.containsKey(arr[i])) {
                firstIndex.put(arr[i], i); // Store first occurrence
            }
            maxDist = Math.max(maxDist, i - firstIndex.get(arr[i])); // Calculate distance
        }

        return maxDist;

--------------------------O(n^2)-------------------------------
class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;
    }
}
