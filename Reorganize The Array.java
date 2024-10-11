

class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        for (int i = 0; i < arr.size(); i++) {

            while (arr.get(i) != -1 && !arr.get(i).equals(i)) {

                // Swap arr[i] with arr[arr[i]]
                int temp = arr.get(i);
                arr.set(i, arr.get(temp));
                arr.set(temp, temp);
            }
        }
        return arr;
   
    }
}
