package graphAlgorithms;

import java.util.ArrayList;

public class BridgesInGraph {
	int timer=0;
    public void dfs(int child,int parent,int[] tin,int[] low,int[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        tin[child]=low[child]=timer++;
        visited[child]=1;
        for(int j:adj.get(child))
        {
            if(j==parent)
                continue;
            if(visited[j]==0)
            {
                dfs(j,child,tin,low,visited,adj);
                low[child]=Math.min(low[child],low[j]);
                if(low[j]>tin[child])
                {
                	System.out.println(j+" "+child);
                }
            }
            else 
                low[child]=Math.min(low[child],low[j]);
        }
    }
    public void  articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        int[] tin=new int[V];
        int[] low=new int[V];
        int[] visited=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,-1,tin,low,visited,adj);
            }
        }
    }
}
