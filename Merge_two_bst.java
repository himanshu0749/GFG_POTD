class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    private void inorder(Node root,List<Integer>l){
        if(root!=null){
            inorder(root.left,l);
            l.add(root.data);
            inorder(root.right,l);
        }
    }
    private List<Integer> mergesort(List<Integer>l1,List<Integer> l2){
        List<Integer> merge=new ArrayList<>();
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                merge.add(l1.get(i));
                i++;
            } 
            else{
                merge.add(l2.get(j));
                j++;
            }
            
        }
        while(i<l1.size()){
            merge.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            merge.add(l2.get(j));
            j++;
        }
        return merge;
    }
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        inorder(root1,l1);
        inorder(root2,l2);
        return mergesort(l1,l2);
    }
}
