package graphdistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Edge
{
    int v;
    int w;
    public Edge(int v,int w)
    {
        this.v=v;
        this.w=w;
    }
}
class Flight
{
    int node;
    int dist;
    int k;
    public Flight(int n,int d,int k)
    {
        this.node=n;
        this.dist=d;
        this.k=k;
    }
}
public class CheapFlightsWithKStops {
	 public int CheapestFLight(int n,int flights[][],int src,int dst,int k) {
	        ArrayList<ArrayList<Edge>> adj=new ArrayList<>();
	        for(int i=0;i<n;i++)
	        {
	            adj.add(new ArrayList<>());
	        }
	        for(int i=0;i<flights.length;i++)
	        {
	            adj.get(flights[i][0]).add(new Edge(flights[i][1],flights[i][2]));
	        }
	        int[] distance=new  int[n];
	        Arrays.fill(distance,Integer.MAX_VALUE);
	        distance[src]=0;
	        Queue<Flight> q=new LinkedList<>();
	        q.add(new Flight(src,0,0));
	        while(!q.isEmpty())
	        {
	            Flight f=q.poll();
	            int node=f.node;
	            int dist=f.dist;
	            int stop=f.k;
	            if(stop>k)
	                continue;
	            for(Edge e:adj.get(node))
	            {
	                int adjNode=e.v;
	                int distadj=e.w;
	                if(distadj + dist < distance[adjNode])
	                {
	                    distance[adjNode]=distadj + dist;
	                    q.add(new Flight(adjNode,distance[adjNode],stop+1));
	                }
	            }
	        }
	        if(distance[dst]==Integer.MAX_VALUE)
	            return -1;
	        return distance[dst];
	    }
}
