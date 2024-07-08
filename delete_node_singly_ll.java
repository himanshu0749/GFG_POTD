class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	    if (head == null || x < 1) {
            return head;
        }

        // If x is 1, delete the head node
        if (x == 1) {
            return head.next;
        }
	    Node curr=head;
	    for(int i=1;i<x-1 && curr!=null;i++){
	        curr=curr.next;
	    }
	    if(curr==null || curr.next==null){
	        return head;
	    }
	    curr.next=curr.next.next;
	    return head;
    }
}
