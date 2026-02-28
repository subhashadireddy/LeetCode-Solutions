class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length ==0)
        {
            return 1;
        }
        int[] s =new int[n+1];
        int[] e = new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            s[trust[i][0]]++;
            e[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(e[i]== n-1 && s[i]==0)
            {
                return i;
            }
        }
        return -1;
}
}
