class Edge {
    public int src, nbr;
    Edge(int src, int nbr){
        this.src = src;
        this.nbr = nbr;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] row : edges){
            int v1 = row[0];
            int v2 = row[1];
            
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        
        boolean[] visited = new boolean[n];
        
        return hasPath(graph,start,end,visited);
    }
    
    public boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest) return true;
        
        visited[src] = true;
        for(Edge e: graph[src]){
            if(visited[e.nbr] == false){
                boolean hasNbrPath = hasPath(graph, e.nbr, dest, visited);
                if(hasNbrPath) return true;
            }
        }
        
        return false;
    }
}