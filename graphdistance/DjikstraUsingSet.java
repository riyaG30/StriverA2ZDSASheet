package graphdistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class DjikstraUsingSet {
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] distance=new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S]=0;
        TreeSet<Djikstra> q=new TreeSet<>((a,b)->a.dist==b.dist ? a.node-b.node : a.dist-b.dist);
        q.add(new Djikstra(S,0));
        while(!q.isEmpty())
        {
            Djikstra p=q.iterator().next();
            q.remove(p);
            int node=p.node;
            int dist=p.dist;
            for(int i=0;i<adj.get(node).size();i++)
            {
                int adjNode=adj.get(node).get(i).get(0);
                int dist1=adj.get(node).get(i).get(1);
                if(dist + dist1 < distance[adjNode])
                {
                    distance[adjNode] = dist + dist1;
                    q.add(new Djikstra(adjNode,distance[adjNode]));
                }
            }
        }
        for(int i=0;i<V;i++)
        {
            if(distance[i]==Integer.MAX_VALUE)
            {
                distance[i]=-1;
            }
        }
        return distance;
    }
}
