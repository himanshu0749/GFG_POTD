class Solution {
    public int getSegments(int[] arr, int n, int x) {
        int segmentCount = 1; // At least one segment is needed
        int currentOR = 0;

        for (int i = 0; i < n; i++) {
            currentOR |= arr[i];

            if (currentOR > x) {
                segmentCount++;
                currentOR = arr[i];
            }
        }

        return segmentCount;
    }
}
