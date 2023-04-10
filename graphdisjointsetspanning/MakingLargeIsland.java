package graphdisjointsetspanning;

import java.util.HashSet;

public class MakingLargeIsland {
	 public int MaxConnection(int grid[][]) {
	        int n=grid.length;
	        int m=grid[0].length;
	        DisJointSetUnionBySize ds=new DisJointSetUnionBySize(n*m);
	        int[] row={-1,0,1,0};
	        int[] col={0,1,0,-1};
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(grid[i][j]==1)
	                {
	                    for(int k=0;k<4;k++)
	                    {
	                        int newr = row[k] + i;
	                        int newc = col[k] + j;
	                        if(newr>=0 && newc>=0 && newr<n && newc<m && grid[newr][newc]==1)
	                        {
	                            int node= i * m + j;
	                            int adjNode = newr * m + newc;
	                            ds.unionBySize(node,adjNode);
	                        }
	                    }
	                }
	            }
	        }
	        int max=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                int size=0;
	                HashSet<Integer> hs=new HashSet<>();
	                if(grid[i][j]==0)
	                {
	                    for(int k=0;k<4;k++)
	                    {
	                        int newr = row[k] + i;
	                        int newc = col[k] + j;
	                        if(newr>=0 && newc>=0 && newr<n && newc<m && grid[newr][newc]==1)
	                        {
	                            int adjNode = newr * m + newc;
	                            hs.add(ds.findParent(adjNode));   
	                        }
	                    }
	                }
	                for(int num : hs)
	                {
	                    size+=ds.size.get(ds.findParent(num));
	                }
	                //As we have to consider the zero as well
	                max=Math.max(size+1,max);
	            }
	        }
	        for(int i=0;i<n * m;i++)
	        {
	            max=Math.max(max,ds.size.get(ds.findParent(i)));
	        }
	        return max;
	    }
}
