HashMap<Integer, Integer> map = new HashMap<>();
        
        int current_sum = 0; // Variable to store the current prefix sum
        int count = 0; // Variable to store the count of subarrays
        
        // Initialize the HashMap with the prefix sum 0 having frequency 1
        map.put(0, 1);
        
        // Traverse through the array
        for (int num : arr) {
            current_sum += num; // Update the current sum
            
            // Check if current_sum - target exists in the map
            if (map.containsKey(current_sum - tar)) {
                count += map.get(current_sum - tar); // Add the frequency to the count
            }
            
            // Update the frequency of the current prefix sum in the map
            map.put(current_sum, map.getOrDefault(current_sum, 0) + 1);
        }
        
        return count;
