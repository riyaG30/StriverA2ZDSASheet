package graphdistance;

import java.util.Arrays;
import java.util.PriorityQueue;

class Maze
{
    int row;
    int col;
    int step;
    public Maze(int r,int c,int s)
    {
        row=r;
        col=c;
        step=s;
    }
}
public class ShortestDistanceInABinaryMaze {
	 int shortestPath(int[][] grid, int[] source, int[] destination) {
	        int sr=source[0],sc=source[1],dr=destination[0],dc=destination[1];
	        if(sr==dr && sc==dc)
	            return 0;
	        int n=grid.length;
	        int m=grid[0].length;
	        int[][] distance=new int[n][m];
	        for(int i=0;i<n;i++)
	        {
	            Arrays.fill(distance[i],Integer.MAX_VALUE);
	        }
	        PriorityQueue<Maze> q=new PriorityQueue<>();
	        q.add(new Maze(sr,sc,0));
	        int[] r={-1,0,1,0};
	        int[] c={0,1,0,-1};
	        while(!q.isEmpty())
	        {
	            Maze temp=q.poll();
	            int row=temp.row;
	            int col=temp.col;
	            int step=temp.step;
	            for(int i=0;i<4;i++)
	            {
	                int rn = r[i] + row;
	                int cn= c[i] + col;
	                if(rn>=0 && cn>=0 && rn<n && cn<m && grid[rn][cn]==1)
	                {
	                    if(step + 1 < distance[rn][cn])
	                    {
	                        if(rn==dr && cn==dc)
	                            return step + 1;
	                        distance[rn][cn]=step+1;
	                        q.add(new Maze(rn,cn,step+1));
	                    }
	                }
	            }
	        }
	        return -1;
	    }
}
