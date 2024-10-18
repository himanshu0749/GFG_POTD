class Solution {
    public int getSingle(int arr[]) {
        int[] c=new int[1000000];
        for(int num:arr){
            c[num]++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]%2!=0){
                return i;
            }
        }
        return -1;
    }
}
