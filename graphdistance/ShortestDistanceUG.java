package graphdistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceUG {
	public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<m;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty())
        {
            int i=q.poll();
            for(int j:adj.get(i))
            {
                if(dist[i] + 1 < dist[j])
                {
                    dist[j] = 1 + dist[i];
                    q.add(j);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
                dist[i]=-1;
        }
        return dist;
    }
}
