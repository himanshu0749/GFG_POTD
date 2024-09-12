class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node xurr=head;
        for(int i=1;i<arr.length;i++){
            xurr.next=new Node(arr[i]);
            xurr=xurr.next;
        }
        return head;
    }
}
