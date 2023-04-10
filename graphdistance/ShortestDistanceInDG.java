package graphdistance;

import java.util.*;

class Pair
{
    int num;
    int weight;
    public Pair(int n,int weight)
    {
        this.num=n;
        this.weight=weight;
    }
}
public class ShortestDistanceInDG {
	public void dfs(int i,int[] visited,ArrayList<ArrayList<Pair>> adj,Stack<Integer> s)
    {
        visited[i]=1;
        for(Pair p:adj.get(i))
        {
            if(visited[p.num]==0)
            {
                dfs(p.num,visited,adj,s);
            }
        }
        s.push(i);
    }
	public int[] shortestPath(int n,int m, int[][] edge) {
		int[] distance=new int[n];
		ArrayList<ArrayList<Pair>> arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		    arr.add(new ArrayList<>());
		Arrays.fill(distance,(int)1e9);
		
		for(int i=0;i<m;i++)
		{
		    arr.get(edge[i][0]).add(new Pair(edge[i][1],edge[i][2]));
		}
		Stack<Integer> s=new Stack<>();
		int[] visited=new int[n];
		for(int i=0;i<n;i++)
		{
		    if(visited[i]==0)
		    {
		        dfs(i,visited,arr,s);
		    }
		}
		distance[0]=0;
		while(!s.isEmpty())
		{
		    int i=s.pop();
		    for(Pair j:arr.get(i))
		    {
		        if(distance[i] + j.weight < distance[j.num])
		        {
		            distance[j.num] = j.weight + distance[i];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(distance[i]==(int)1e9)
		    {
		        distance[i]=-1;
		    }
		}
		return distance;
	}
}
