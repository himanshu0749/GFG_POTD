class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>bfs=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();
        boolean[] visit=new boolean[V];
        visit[0]=true;
        queue.add(0);
        while(!queue.isEmpty()){
            int node=queue.poll();
            bfs.add(node);
            
            for(int neighbour:adj.get(node)){
                if(!visit[neighbour]){
                    queue.add(neighbour);
                    visit[neighbour]=true;
                }
            }
        }
        return bfs;
    }
}
