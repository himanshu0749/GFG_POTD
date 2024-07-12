class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        pre(res,root);
        return res;
    }
    public static void pre(ArrayList<Integer>res,Node root){
        if(root==null) return;
        res.add(root.data);
        pre(res,root.left);
        pre(res,root.right);
    }

}
