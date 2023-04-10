package graphdistance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Multi
{
    int node;
    int step;
    public Multi(int n,int s)
    {
        node=n;
        step=s;
    }
}
public class MinimumMultiplicationToReachEnd {
	int minimumMultiplications(int[] arr, int start, int end) {
        int mod=100000;
        int[] distance=new int[100000];
        Queue<Multi> q=new LinkedList<>();
        q.add(new Multi(start,0));
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start]=0;
        while(!q.isEmpty())
        {
            int node=q.peek().node;
            int step=q.peek().step;
            q.poll();
            if(node==end)
                return step;
            for(int i=0;i<arr.length;i++)
            {
                int num = (node * arr[i]) % mod;
                if(step + 1 < distance[num])
                {
                    distance[num]=step + 1;
                    q.add(new Multi(num,distance[num]));
                }
            }
        }
        return -1;
    }
}
