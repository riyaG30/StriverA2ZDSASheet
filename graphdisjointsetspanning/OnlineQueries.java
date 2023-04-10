package graphdisjointsetspanning;

import java.util.ArrayList;
import java.util.List;

public class OnlineQueries {
	public List<Integer> queries(int n,int m,int[][] operators)
	{
		int count=0;
		DisJointSetUnionBySize ds=new DisJointSetUnionBySize(n*m);
		List<Integer> ans=new ArrayList<>();
		int[][] visited=new int[n][m];
		int[] row= {-1,0,1,0};
		int[] col= {0,1,0,-1};
		for(int i=0;i<n;i++)
		{
			int r=operators[i][0];
			int c=operators[i][1];
			if(visited[r][c]==1)
			{
				ans.add(count);
				continue;
			}
			visited[r][c]=1;
			count++;
			for(int k=0;k<4;k++)
			{
				int newr = r + row[i];
				int newc = c + col[i];
				if(newr>=0 && newc>=0 && newr<n && newc<m)
				{
					if(visited[newr][newc]==1)
					{
						int node = r * m + c;
						int adjNode = newr * m + newc;
						if(ds.findParent(node)!=ds.findParent(adjNode))
						{
							count--;
							ds.unionBySize(node, adjNode);
						}
					}
				}
			}
			ans.add(count);
		}
//		System.out.println(ans);
		return ans;
	}
	
}
