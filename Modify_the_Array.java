----------------------------------------------------------------------
*************** Without using ArrayList***************************
int n=arr.length;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]==arr[i+1] && arr[i]!=0){
        //         arr[i]*=2;
        //         arr[i+1]=0;
        //     }
        // }
        // int c=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         arr[c]=arr[i];
        //         if(c!=i){
        //             arr[i]=0;
        //         }
        //     }
        //     c++;
        // }



----------------------------------------------------------------------------
**********************Using ArrayList**************************************



// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function\
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == 0){
                continue;
            }else{
                if(arr[i] == arr[i+1]){
                    arr[i] = arr[i] * 2;
                    
                    arr[i+1] = 0;
                }
            }
        }
        int c = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
                c++;
            }
            
        }
        while(c < arr.length){
            list.add(0);
            c++;
        }
        return list;
    }
}
