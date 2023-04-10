package graphdisjointsetspanning;

public class MakingAGraphConnected {
	public int Solve(int n, int[][] edge) {
        DisJointSetUnionBySize ds=new DisJointSetUnionBySize(n);
        int countOfExtra=0;
        for(int i=0;i<edge.length;i++)
        {
            int u=edge[i][0];
            int v=edge[i][1];
            if(ds.findParent(u)!=ds.findParent(v))
            {
                ds.unionBySize(u,v);
            }
            else
            {
                countOfExtra++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i==ds.findParent(i))
                count++;
        }
        count-=1;
        if(countOfExtra>=count)
            return count;
        return -1;
    }
}
