---------------------Stack--------------------------------
  class Solution {
        boolean isPalindrome(Node head) {
            if (head == null || head.next == null)    return true;
            Stack<Integer> stack = new Stack<>();
            Node current = head;
            while (current != null) {
                stack.push(current.data);
                current = current.next;
            }
            current = head;
            while (current != null){ 
                if (current.data != stack.pop())    return false;
                current = current.next;
            }
            return true;
        }
    }

------------------Slow & fast-------------------------------------


    /* Structure of class Node is
    class Node
    {
        int data;
        Node next;
    
        Node(int d)
        {
            data = d;
            next = null;
        }
    }*/
    
    class Solution {
        boolean isPalindrome(Node head) {
            if (head == null || head.next == null)    return true;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node prev = null;
            Node curr = slow;
            while (curr != null) {
                Node nextTemp = curr.next; 
                curr.next = prev;          
                prev = curr;          
                curr = nextTemp;        
            }
            Node firstHalf = head;
            Node secondHalf = prev;
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
        }
}
