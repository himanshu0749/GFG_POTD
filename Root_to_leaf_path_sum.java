class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
        if (root==null) return false;
        if (root.left==null && root.right==null) return root.data==target;
        int rem=target-root.data;
        return hasPathSum(root.left,rem) || hasPathSum(root.right,rem);
    }
}
