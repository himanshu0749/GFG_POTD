-----------------simple Approach----------------------------
--------------------TLE-----------------------------------
public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        int n=arr.length;
        int max=0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n-k;i++){
            max=arr[i];
            for(int j=i+1;j<k;j++){
                max=Math.max(max,arr[j]);
            }
            res.add(max);
        }
        return res;
    }
-----------------------------------------------------------------------------


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();

        if (arr == null || k <= 0 || n < k) {
            return result;
        }

        // Arrays to store maximum of the current subarray
        int[] left = new int[n];
        int[] right = new int[n];

        // Fill left array where left[i] is the maximum from arr[i] to arr[i + k - 1] for each block
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                left[i] = arr[i];
            } else {
                left[i] = Math.max(left[i - 1], arr[i]);
            }
        }

        // Fill right array where right[i] is the maximum from arr[i - k + 1] to arr[i] for each block
        for (int i = n - 1; i >= 0; i--) {
            if (i % k == k - 1 || i == n - 1) {
                right[i] = arr[i];
            } else {
                right[i] = Math.max(right[i + 1], arr[i]);
            }
        }

        // Collect the maximum values for each subarray of size k
        for (int i = 0; i <= n - k; i++) {
            result.add(Math.max(right[i], left[i + k - 1]));
        }

        return result;
    }
}
