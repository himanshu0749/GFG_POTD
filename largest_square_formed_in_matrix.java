class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        // code here
        int c=0;
        if(n==0 || m==0) return 0;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    if(i==0 || j==0) arr[i][j]=1;
                    else{
                        c=Math.min(arr[i-1][j],
                            Math.min(arr[i][j-1],arr[i-1][j-1]))+1;
                    }
                    c=Math.max(c,arr[i][j]);
                }
            }
        }
        return c;
    }
}
