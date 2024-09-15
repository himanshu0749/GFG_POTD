--------------------------------------------------------------------------------------------------------
Optimised Approach

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
  Node prev=null,head=null;
    Node bToDLL(Node root)
    {
	//  Your code here
	 
	if(root==null) return null;
	bToDLL(root.left);
	if(prev==null) head=root;
	else{
	    root.left=prev;
	    prev.right=root;
	}
	prev=root;
	bToDLL(root.right);
	return head;
    }
}



-------------------------------------------------------------------------------------------------------
Brute Force Approach




class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	ArrayList <Integer> list = new ArrayList();
	inorder(root,list);
	Node head = new Node(list.get(0));
	Node temp = head;
	for(int i = 1;i<list.size();i++){
	    Node newNode = new Node (list.get(i));
	    temp.right= newNode;
	    newNode.left =  temp;
	    temp = temp.right;
	    
	}
	     return head;
    }
    private void inorder(Node root, ArrayList<Integer> list){
        if(root!= null){
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right,list);
        }
    }
}
