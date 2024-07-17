class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        // Your code here
        int n=parent.length;
        Node[] create=new Node[n];
        for(int i=0;i<n;i++){
            create[i]=new Node(i);
        }
        Node root =null;
        for(int i=0;i<n;i++){
            if(parent[i]==-1) root=create[i];
            else{
                Node p=create[parent[i]];
                if(p.left==null) p.left=create[i];
                else{
                    p.right=create[i];
                }
            }
        }
        return root;
    }
}
