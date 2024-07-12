class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a) {
        // Push element into q1
        q1.add(a);
    }

    // Function to pop an element from stack using two queues.
    int pop() {
        // If q1 is empty, the stack is empty
        if (q1.isEmpty()) {
            return -1;
        }

        // Leave one element in q1 and push others to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // The last element in q1 is the top element of the stack
        int top = q1.poll();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;

    }
	
}

