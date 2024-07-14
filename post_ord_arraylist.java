class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> res=new ArrayList<>();
       poO_t(root,res);
       return res;
    }
    public static void poO_t(Node root,ArrayList<Integer>res){
        if(root==null) return;
        poO_t(root.left,res);
        poO_t(root.right,res);
        
        
        res.add(root.data);
    }
