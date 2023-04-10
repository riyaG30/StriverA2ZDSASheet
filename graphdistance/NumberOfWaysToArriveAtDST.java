package graphdistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Ways
{
    int node;
    int distance;
    public Ways(int n,int d)
    {
        node=n;
        distance=d;
    }
}
public class NumberOfWaysToArriveAtDST {
	public int countPaths(int n, int[][] roads) {
        int mod=(int)(1e9+7);
        ArrayList<ArrayList<Ways>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }       
        for(int i=0;i<roads.length;i++)
        {
            adj.get(roads[i][0]).add(new Ways(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Ways(roads[i][0],roads[i][2]));
        }
        int[] distance=new int[n];
        int[] ways=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        ways[0]=1;
        PriorityQueue<Ways> q=new PriorityQueue<>((a,b)->a.distance-b.distance);
        q.add(new Ways(0,0));
        while(!q.isEmpty())
        {
            Ways p=q.remove();
            int node=p.node;
            int dist=p.distance;
            for(Ways temp:adj.get(node))
            {
                int adjNode=temp.node;
                int distNode=temp.distance;
                if(dist + distNode < distance[adjNode])
                {
                    distance[adjNode]=dist + distNode;
                    q.add(new Ways(adjNode,distance[adjNode]));
                    ways[adjNode]=ways[node];
                }
                else if(dist + distNode ==distance[adjNode])
                {
                    ways[adjNode] = (ways[node] + ways[adjNode])%mod;
                }
            }
        }
        if(ways[n-1]==Integer.MAX_VALUE)
            return -1;
        return ways[n-1]%mod;
    }
}
