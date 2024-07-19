class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(adj, visited, i);
            }
        }
        return count;
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node) {
        visited[node] = true;
        
        for (int i = 0; i < adj.get(node).size(); i++) {
            if (adj.get(node).get(i) == 1 && !visited[i]) {
                dfs(adj, visited, i);
            }
        }
    }
