class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if (head == null || head.next == null || k == 0) return head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        while(k>0){
            temp=temp.next;
            k--;
        }
        Node newnode=temp.next;
        temp.next=null;
        return newnode;
    }
}
