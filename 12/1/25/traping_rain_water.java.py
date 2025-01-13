
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

Examples:

Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units


------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int i = 0 , j = arr.length-1 , water = 0;
        int lt_max = 0 , rt_max = 0;
        while(i < j){
            /*int max_height = Math.max(arr[i] , arr[j]);
            int min_height = Math.min(arr[i] , arr[j]);*/
            lt_max = Math.max(lt_max , arr[i]);
            rt_max = Math.max(rt_max , arr[j]);
            /*water += (max_height - min_height);
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }*/
            if(arr[i] < arr[j]){
                water += lt_max - arr[i];
                i++;
            }else{
                water += rt_max - arr[j];
                j--;
            }
        }
        return water;
    }
}


In python



class Solution:
    def maxWater(self, arr):
        # code here
        i , j , lmx , rmx , water = 0 , len(arr)-1 , 0 , 0 , 0 
        while i < j:
            lmx = max( lmx , arr[i] )
            rmx = max( rmx , arr[j] )
            if arr[i] < arr[j]:
                water += lmx - arr[i]
                i += 1
            else:
                water += rmx - arr[j]
                j -= 1
        return water
