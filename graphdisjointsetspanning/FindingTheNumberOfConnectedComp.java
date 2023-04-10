package graphdisjointsetspanning;

public class FindingTheNumberOfConnectedComp {
	public int Solve(int n, int[][] edge) {
        DisJointSetUnionBySize ds=new DisJointSetUnionBySize(n);
        for(int i=0;i<edge.length;i++)
        {
            int u=edge[i][0];
            int v=edge[i][1];
            if(ds.findParent(u)!=ds.findParent(v))
            {
                ds.unionBySize(u,v);
            }
        }
        int count=0;
        //the parent only will have the same value others will have the parent number at their index
        for(int i=0;i<n;i++)
        {
            if(i==ds.findParent(i))
                count++;
        }
        return count;
    }
}
