package graphAlgorithms;

import java.util.ArrayList;

public class CheckForBridge {
	static void dfs(int i,int[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        visited[i]=1;
        for(int j:adj.get(i))
        {
            if(visited[j]==0)
            {
                dfs(j,visited,adj);
            }
        }
    }
    @SuppressWarnings("removal")
	static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        int[] visited=new int[V];
        int count1=0;
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                count1++;
                dfs(i,visited,adj);
            }
        }
        visited=new int[V];
        int count2=0;
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                count2++;
                dfs(i,visited,adj);
            }
        }
        if(count2>count1)
            return 1;
        return 0;
    }
}
