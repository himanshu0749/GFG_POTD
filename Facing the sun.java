class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        
        int count = 1 ;
        int maxNum = height[0];
        
        for(int i = 1; i < height.length; i++){
            if(height[i] > maxNum){
                maxNum = height[i];
                count++;
            }
        }
        
        return count;
    }
}
