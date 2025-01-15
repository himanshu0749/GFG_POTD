Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

Examples:

Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.


public int longestSubarray(int[] arr, int k) {
        // code here
        
        // Brute Force Approach
        // Nested loop
        
        /*int longest = 0;
        for( int i = 0 ; i < arr.length ; i++){
            int count = 0; 
            for( int j = i ; j < arr.length ; j++){
                count += arr[j];
                if ( count == k ){
                    longest = Math.max(longest , j - i + 1);
                }
            }
        }
        return longest;*/
        
        // 2 Pointer Approach
        
        /*int st = 0 , count = 0 , longest = 0;
        for ( int ed = 0 ; ed < arr.length ; ed++ ){
            count += arr[ed];
            while( count > k && st <= ed ){
                count -= arr[st];
                st++;
            }
            if( count == k ) longest = Math.max(longest , ed -st + 1);
        }
        return longest;*/
        
        // Using Hashmap Prefix Sum
        
        Map <Integer , Integer> mp = new HashMap<>();
        int curr_sum =0 , max_sum = 0 ;
        for( int i = 0 ; i < arr.length ;i++ ){
            curr_sum += arr[i];
            if( curr_sum == k ) max_sum = i + 1;
            if ( mp.containsKey(curr_sum - k) ) max_sum = Math.max(max_sum , i - mp.get(curr_sum - k));
            if( !mp.containsKey(curr_sum) ) mp.put(curr_sum , i);
        }
        return max_sum;
    }
