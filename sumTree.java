class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.data==sum(root.left)+sum(root.right)) return isSumTree(root.left)&&isSumTree(root.right);
        return false;
    }
    public int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
}
