package graphdisjointsetspanning;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Span
{
    int node;
    int weight;
    public Span(int n,int w)
    {
        node=n;
        weight=w;
    }
}
public class PrimAlgorithm {
	static int spanningTree(int V, int E, int edges[][]){
	    ArrayList<ArrayList<Span>> adj=new ArrayList<>();
	    for(int i=0;i<V;i++)
	        adj.add(new ArrayList<>());
	    for(int i=0;i<E;i++)
	    {
	        adj.get(edges[i][0]).add(new Span(edges[i][1],edges[i][2]));
	        adj.get(edges[i][1]).add(new Span(edges[i][0],edges[i][2]));
	    }
	    int[] visited=new int[V];
	    PriorityQueue<Span> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
	    pq.add(new Span(0,0));
	    int sum=0;
	    while(!pq.isEmpty())
	    {
	        Span p=pq.poll();
	        if(visited[p.node]==1)
	            continue;
	        visited[p.node]=1;
	        sum+=p.weight;
	        for(Span j:adj.get(p.node))
	        {
	            if(visited[j.node]==0)
	            {
	                pq.add(new Span(j.node,j.weight));
	            }
	        }
	    }
	    return sum;
	}
}
