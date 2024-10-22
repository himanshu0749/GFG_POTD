class Solution {

    // Return the sum of last k nodes
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;      
            current = next;
        }
        return prev;
    }
   public int sumOfLastN_Nodes(Node head, int n) {
        // if (head == null) return 0;
        // Node slow = head;
        // Node fast = head;
        // while (fast != null && fast.next != null) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        // int sum = 0;
        // while (slow != null) {
        //     sum += slow.data;
        //     slow = slow.next;
        // }
        // return sum;
        
        if (head == null) return 0;
        Node reversedHead = reverseList(head);
        int sum = 0;
        Node temp = reversedHead;
        for (int i = 0; i < n && temp != null; i++) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}
