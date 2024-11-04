// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        // List<List<Integer>>temp=new ArrayList<>();
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length-2;i++){
        //     int left=i+1;
        //     int right=arr.length-1;
        //     while(left<right){
        //         int sum=arr[i]+arr[left]+arr[right];
        //         if(sum==0){
        //             temp.add(Arrays.asList(i,left,right));
        //             left++;
        //             right--;
        //         }else if(sum<0){
        //             left++;
        //         }else{
        //             right--;
        //         }
        //     }
        // }
        // return temp;
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            for (int j = i + 1; j < n; j++) {
                int b = arr[j];
                for (int k = j + 1; k < n; k++) {
                    int c = arr[k];
                    if (a + b + c == 0) {
                        ans.add(List.of(i, j, k));
                    }
                }
            }
        }
        return ans;
    }
}
