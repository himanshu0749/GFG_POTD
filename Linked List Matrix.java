class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        if(arr==null || arr.length==0) return null;
        int n=arr.length;
        Node[][] mat=new Node[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat[i][j] = new Node(arr[i][j]);
                if(i>0) mat[i - 1][j].down = mat[i][j];
                if(j>0) mat[i][j - 1].right = mat[i][j]; // Link right
            }
        }
        return mat[0][0];
    }
}
