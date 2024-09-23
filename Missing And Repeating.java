class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int[] r=new int[2];
        int[] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]+=1;
        }
        for(int i=1;i<=arr.length;i++){
            if(freq[i]==2) r[0]=i;
            else if(freq[i]==0){
                r[1]=i;
            }
        }
        return r;
    }
}
