class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n=arr.length;
        int[] count = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            count[num]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] > 1) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
}
