

// User function Template for Java

class Solution {
    public int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int[] indexes = new int[n];
        
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        
        mergeSort(arr, result, indexes, 0, n - 1);
        
        return result;
    }
    
    private void mergeSort(int[] arr, int[] result, int[] indexes, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(arr, result, indexes, left, mid);
        mergeSort(arr, result, indexes, mid + 1, right);
        merge(arr, result, indexes, left, mid, right);
    }
    
    private void merge(int[] arr, int[] result, int[] indexes, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int[] tempIndexes = new int[right - left + 1];
        
        int i = left, j = mid + 1, k = 0, rightCount = 0;
        
        while (i <= mid && j <= right) {
            if (arr[indexes[i]] <= arr[indexes[j]]) {
                result[indexes[i]] += rightCount;
                tempIndexes[k] = indexes[i];
                i++;
            } else {
                rightCount++;
                tempIndexes[k] = indexes[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            result[indexes[i]] += rightCount;
            tempIndexes[k] = indexes[i];
            i++;
            k++;
        }
        
        while (j <= right) {
            tempIndexes[k] = indexes[j];
            j++;
            k++;
        }
        
        for (i = left; i <= right; i++) {
            indexes[i] = tempIndexes[i - left];
        }
    }
}
