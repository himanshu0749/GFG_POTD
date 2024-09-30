class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    private void inorder(Node root, List<Integer>list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        inorder(root1,l1);
        inorder(root2,l2);
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                res.add(l1.get(i));
                i++;
            }else{
                res.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()){
            res.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            res.add(l2.get(j));
            j++;
        }
        return res;
    }
    
}
