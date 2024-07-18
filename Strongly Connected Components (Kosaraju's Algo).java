 public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        
        // Step 1: Perform a DFS to fill the stack with nodes in the order of their finishing times.
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                fillOrder(i, visited, stack, adj);
            }
        }
        
        // Step 2: Create the transposed graph.
        ArrayList<ArrayList<Integer>> transpose = getTranspose(V, adj);
        
        // Step 3: Perform a DFS on the transposed graph in the order defined by the stack.
        Arrays.fill(visited, false);
        int sccCount = 0;
        
        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (!visited[v]) {
                dfs(v, visited, transpose);
                sccCount++;
            }
        }
        
        return sccCount;
    }
    
    // Helper function to perform a DFS and fill the stack with nodes in the order of their finishing times.
    private void fillOrder(int v, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                fillOrder(neighbor, visited, stack, adj);
            }
        }
        stack.push(v);
    }
    
    // Helper function to get the transposed graph.
    private ArrayList<ArrayList<Integer>> getTranspose(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            transpose.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                transpose.get(neighbor).add(i);
            }
        }
        return transpose;
    }
    
    // Helper function to perform a DFS on the transposed graph.
    private void dfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
