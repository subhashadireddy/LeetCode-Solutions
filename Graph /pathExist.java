class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            g.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        return Bst(source,destination,g,n);
    }
    static boolean Bst(int s, int d, List<List<Integer>> a, int n){
        boolean[] visited = new boolean[n];
        visited[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty())
        {
            int no = q.poll();
            if(no == d){
                return true;
            }
            for(int i : a.get(no))
            {
                if(!visited[i])
                {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return false;
    }
    
}
