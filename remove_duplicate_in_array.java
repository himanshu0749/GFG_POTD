class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> new_list=new ArrayList<>();
        for(int val:arr){
            if(!new_list.contains(val)){
                new_list.add(val);
            }
        }
        return new_list;
    }
}
