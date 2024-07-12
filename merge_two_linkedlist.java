  Node dummy = new Node(0);
        Node current = dummy;

        // Traverse both linked lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;  // Attach head1's node to the merged list
                head1 = head1.next;    // Move to the next node in head1
            } else {
                current.next = head2;  // Attach head2's node to the merged list
                head2 = head2.next;    // Move to the next node in head2
            }
            current = current.next;  // Move to the next node in the merged list
        }

        // Attach the remaining nodes from either head1 or head2
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        // Return the next node of dummy which is the head of the merged list
        return dummy.next;
