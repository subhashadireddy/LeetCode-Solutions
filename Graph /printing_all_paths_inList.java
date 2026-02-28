class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int dest = graph.length - 1;
        List<List<Integer>> allpaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0,dest,graph,path,allpaths);
        return allpaths;
    }
    public static void  dfs(int s , int d ,int[][] a, List<Integer> path,List<List<Integer>> allpaths)
    {
        path.add(s);
        if(s==d)
        {
            allpaths.add(new ArrayList<>(path));
        }
        else{

            for(int i : a[s])
        {
            dfs(i,d,a,path,allpaths);
        }
        }
        path.remove(path.size()-1);
    }
}
