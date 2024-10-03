

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // Step 1: Find the potential candidates using Boyer-Moore Voting algorithm
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Validate the candidates
        count1 = 0;
        count2 = 0;
        int n = nums.size();

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        // Step 3: Add valid candidates to the result list
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // If no candidates found, return [-1]
        if (result.isEmpty()) result.add(-1);

        return result;
    }
}
