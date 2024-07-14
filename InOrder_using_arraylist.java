class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res=new ArrayList<>();
        inO_t(root,res);
        return res;
    }
    public static void inO_t(Node root, ArrayList<Integer>res){
        if(root==null) return;
        inO_t(root.left,res);
        res.add(root.data);
        inO_t(root.right,res);
    }
}
