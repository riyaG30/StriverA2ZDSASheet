package graphAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

class Edge
{
    int u;
    int v;
    int weight;
    public Edge(int u,int v,int w)
    {
        this.u=u;
        this.v=v;
        weight=w;
    }
}

public class BellmanFordAlgorithm {
	//this algorithm can be used to find the shortest distance and also detect negative cycle if present
	//We iterate for V-1 iterations 
	//After that we iterate one more time to check whether there is decrease if yes then negative cycle exists and we return -1
	static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
	       ArrayList<Edge> arr=new ArrayList<>();
	       for(ArrayList<Integer> ans:edges)
	       {
	           int u=ans.get(0);
	           int v=ans.get(1);
	           int w=ans.get(2);
	           arr.add(new Edge(u,v,w));
	       }
	       int[] distance=new int[V];
	       //According to requirement
	       Arrays.fill(distance,(int)1e8);
	       distance[S]=0;
	       for(int i=0;i<V-1;i++)
	       {
	           for(Edge e:arr)
	           {
	               int u=e.u;
	               int v=e.v;
	               int w=e.weight;
	               if(distance[u] + w < distance[v])
	               {
	                   distance[v]=distance[u] + w;
	               }
	           }
	       }
	       for(Edge e:arr)
	           {
	               int u=e.u;
	               int v=e.v;
	               int w=e.weight;
	               if(distance[u] + w < distance[v])
	               {
	                   distance[v]=distance[u] + w;
	                   return new int[]{-1};
	               }
	           }
	      return distance;
	    }

}
