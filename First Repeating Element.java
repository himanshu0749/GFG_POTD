class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
         Map<Integer, Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if (mp.get(arr[i]) > 1) return i + 1;
        }
        return -1;
    }
}
