package graphAlgorithms;

import java.util.ArrayList;

public class ArticulationsInGraph {
	int timer=0;
    public void dfs(int child,int parent,int[] mark,int[] tin,int[] low,int[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        tin[child]=low[child]=timer++;
        visited[child]=1;
        int count=0;
        for(int j:adj.get(child))
        {
            if(j==parent)
                continue;
            if(visited[j]==0)
            {
                dfs(j,child,mark,tin,low,visited,adj);
                low[child]=Math.min(low[child],low[j]);
                count++;
                if(low[j]>=tin[child] && parent!=-1)
                    mark[child]=1;
            }
            else 
                low[child]=Math.min(low[child],tin[j]);
        }
        if(count>1 && parent==-1)
            mark[child]=1;
    }
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] mark=new int[V];
        int[] tin=new int[V];
        int[] low=new int[V];
        int[] visited=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,-1,mark,tin,low,visited,adj);
            }
        }
        for(int i=0;i<V;i++)
        {
            if(mark[i]==1)
                ans.add(i);
        }
        if(ans.size()==0)
            ans.add(-1);
        return ans;
    }
}
