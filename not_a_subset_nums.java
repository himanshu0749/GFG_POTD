class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        int small=1;
        for(int num:arr){
            if(num>small) break;
            small+=num;
        }
        return small;
    }
}
