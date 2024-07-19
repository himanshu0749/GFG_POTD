 int[] dist = new int[V];
        Arrays.fill(dist, 100000000); // fill all distances with 1e8
        dist[S] = 0; // distance to source is 0

        // Step 2: Relax all edges |V| - 1 times
        for (int i = 0; i < V - 1; i++) {
            for (ArrayList<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                if (dist[u] != 100000000 && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Step 3: Check for negative-weight cycles
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int w = edge.get(2);
            if (dist[u] != 100000000 && dist[u] + w < dist[v]) {
                // If we can still relax an edge, then there is a negative cycle
                return new int[]{-1};
            }
        }

        return dist;
