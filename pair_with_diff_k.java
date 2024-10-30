class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        // Arrays.sort(arr);
        // int count=0;
        // int j=1;
        // for(int i=0; i<arr.length; i++){
        //     for(j=i+1; j<arr.length; j++){
        //         if(arr[j]-arr[i]>=k) break;
        //     }
        //     if(j<arr.length && arr[j]-arr[i]==k) count++;
        // }
        // return count;
        
        // Arrays.sort(arr);
        // int i = 0, j = 1, count = 0;
        // while (j < arr.length) {
        //     int diff = arr[j] - arr[i];
        //     if (diff == k) {
        //         count++;
        //         i++;
        //         j++;
        //         while (j < arr.length && arr[j] == arr[j - 1]) {
        //             j++;
        //         }
        //         while (i < arr.length - 1 && arr[i] == arr[i - 1]) {
        //             i++;
        //         }
        //     } else if (diff < k) {
        //         j++;
        //     } else {
        //         i++;
        //         if (i == j) {
        //             j++;
        //         }
        //     }
        // }
        // return count;
        
        
        // HashSet<Integer> mp= new HashSet<>();
        // int count=0;
        // for(int val:arr) mp.add(val);
        // for(int num:mp){
        //     if(mp.contains(num+k)){
        //         count++;
        //     }
        // }
        // return count;
        
    }

-----------------------------------------------------------------------------------



// User function Template for Java
class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
         HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Fill the map with the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Traverse each element in arr to check for pairs
        for (int num : arr) {
            // Check if there exists a number `num + k` to form a pair with `num`
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            // Check if there exists a number `num - k` to form a pair with `num`
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            // Remove the current element from the map to avoid duplicate counting
            map.put(num, map.get(num) - 1);
            if (map.get(num) == 0) {
                map.remove(num);
            }
        }

        return count;
        
    }
}
