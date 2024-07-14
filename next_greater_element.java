public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] res=new long[n];
        Stack<Long> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]) stack.pop();
           
            if(stack.isEmpty()) res[i]=-1;
            else{
                res[i]=stack.peek();
            }
             stack.push(arr[i]);
        }
        return res;
    } 
