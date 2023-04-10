package graphdistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Travel
{
    int v;
    int weight;
    public Travel(int v,int weight)
    {
        this.v=v;
        this.weight=weight;
    }
}
public class AlexTraveling {
	int minimumCost(int[][] flights, int n, int k) {
        ArrayList<ArrayList<Travel>> adj=new ArrayList<>();
        int[] distance=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        PriorityQueue<Travel> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        for(int i=0;i<flights.length;i++)
        {
            adj.get(flights[i][0]).add(new Travel(flights[i][1],flights[i][2]));
        }
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;
        pq.add(new Travel(k,0));
        while(!pq.isEmpty())
        {
            Travel t=pq.poll();
            int node=t.v;
            int dist=t.weight;
            for(Travel temp:adj.get(node))
            {
                int adjNode=temp.v;
                int dist1=temp.weight;
                if(dist + dist1 < distance[adjNode])
                {
                    distance[adjNode] = dist + dist1;
                    pq.add(new Travel(adjNode,distance[adjNode]));
                }
            }
        }
        int maxi=0;
        for(int i=1;i<=n;i++)
        {
            maxi=Math.max(maxi,distance[i]);
        }
        if(maxi==Integer.MAX_VALUE)
            return -1;
        return maxi;
    }
}
