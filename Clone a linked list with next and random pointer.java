if (head == null) return null;
        
        // Step 1: Create new nodes and interleave them with original nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next; // Move to the next original node
        }
        
        // Step 2: Assign random pointers for the new nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next; // Point to the copied node
            }
            curr = curr.next.next; // Move to the next original node
        }
        
        // Step 3: Separate the two lists
        Node original = head;
        Node copyHead = head.next; // The head of the new list
        Node copyCurr = copyHead;
        
        while (original != null) {
            original.next = original.next.next; // Restore the original list
            if (copyCurr.next != null) {
                copyCurr.next = copyCurr.next.next; // Link the copied nodes
            }
            original = original.next;
            copyCurr = copyCurr.next;
        }
        
        return copyHead;
