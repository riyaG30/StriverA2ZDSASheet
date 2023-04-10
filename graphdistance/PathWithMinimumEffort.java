package graphdistance;

import java.util.Arrays;
import java.util.PriorityQueue;

class Minimum
{
    int row;
    int col;
    int diff;
    public Minimum(int r,int c,int d)
    {
        row=r;
        col=c;
        diff=d;
    }
}
public class PathWithMinimumEffort {
	int MinimumEffort(int grid[][]) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] distance=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Minimum> q=new PriorityQueue<>((a,b)->a.diff-b.diff);
        q.add(new Minimum(0,0,0));
        int[] r={-1,0,1,0};
        int[] c={0,1,0,-1};
        while(!q.isEmpty())
        {
            Minimum temp=q.poll();
            int row=temp.row;
            int col=temp.col;
            int weight=temp.diff;
            if(row==n-1 && col==m-1)
                return weight;
            for(int i=0;i<4;i++)
            {
                int rn = r[i] + row;
                int cn= c[i] + col;
                if(rn>=0 && cn>=0 && rn<n && cn<m)
                {
                    int diff=Math.max(weight,Math.abs(grid[rn][cn]-grid[row][col]));
                    if(diff < distance[rn][cn])
                    {
                        distance[rn][cn]=diff;
                        q.add(new Minimum(rn,cn,diff));
                    }
                }
            }
        }
        return -1;
    }
}
