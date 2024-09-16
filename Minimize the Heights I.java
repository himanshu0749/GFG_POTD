class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        if (n == 1) {
            return 0; // Only one tower, difference is zero
        }

        // Sort the array
        Arrays.sort(arr);

        // Initialize the minimum difference as the current difference
        int minDiff = arr[n - 1] - arr[0];

        // Iterate through the sorted heights to find the minimal range
        for (int i = 0; i < n - 1; i++) {
            // Compute possible new values after adjustment
            int high = Math.max(arr[i] + k, arr[n - 1] - k);
            int low = Math.min(arr[0] + k, arr[i + 1] - k);
            minDiff = Math.min(minDiff, high - low);
        }

        return minDiff;
    }
}
