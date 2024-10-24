import java.util.HashMap;

public class Solution {
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        HashMap<Integer,Integer>mp=new HashMap<>();
        int count=0;
        int left=0;
        for(int right=0;right<n;right++){
            mp.put(arr[right],mp.getOrDefault(arr[right],0)+1);
            while(mp.size()>2){
                mp.put(arr[left],mp.get(arr[left])-1);
                if(mp.get(arr[left])==0) mp.remove(arr[left]);
                left++;
            }
            count=Math.max(count,right-left+1);
        }
        return count;

    }
}
