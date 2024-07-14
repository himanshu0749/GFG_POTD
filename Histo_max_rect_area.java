Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int index = 0;

        // Traverse the histogram
        while (index < n) {
            // If the stack is empty or the current bar is higher than the bar at stack top, push it to the stack
            if (stack.isEmpty() || hist[index] >= hist[stack.peek()]) {
                stack.push(index++);
            } else {
                // Pop the top element from the stack
                int top = stack.pop();
                // Calculate the area with hist[top] as the smallest (or minimum height) bar 'h'
                long area = hist[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                // Update maxArea, if needed
                maxArea = Math.max(maxArea, area);
            }
        }

        // Now, pop the remaining bars from stack and calculate area with each popped bar
        while (!stack.isEmpty()) {
            int top = stack.pop();
            long area = hist[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
