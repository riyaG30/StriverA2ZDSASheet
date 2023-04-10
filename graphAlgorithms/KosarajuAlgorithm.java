package graphAlgorithms;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {
	//This algorithm is used to find the connected component for directed graph
	//In this we make a dfs traversal store the topo sort
	//then reverse the direction
	//After reversal again make a dfs traversal
	public void dfs(int i,int[] visited,ArrayList<ArrayList<Integer>> adj,Stack<Integer> s)
    {
        visited[i]=1;
        for(int j:adj.get(i))
        {
            if(visited[j]==0)
            {
                dfs(j,visited,adj,s);
            }
        }
        s.push(i);
    }
    public void dfs2(int i,int[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        visited[i]=1;
        for(int j:adj.get(i))
        {
            if(visited[j]==0)
            {
                dfs2(j,visited,adj);
            }
        }
    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> s=new Stack<>();
        int[] visited=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
                dfs(i,visited,adj,s);
        }
        ArrayList<ArrayList<Integer>> adjT=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adjT.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            visited[i]=0;
            for(int j:adj.get(i))
            {
                adjT.get(j).add(i);
            }
        }
        int count=0;
        while(!s.isEmpty())
        {
            int i=s.pop();
            if(visited[i]==0)
            {
                count++;
                dfs2(i,visited,adjT);
            }
        }
        return count;
    }
}
