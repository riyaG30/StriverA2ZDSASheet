package graphtraversalquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nearest
{
    int row;
    int col;
    int time;
    public Nearest(int r,int c,int t)
    {
        row=r;
        col=c;
        time=t;
    }
}
public class Matrix01 {
	public static void nearest(int[][] grid)
    {
        Queue<Nearest> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    q.add(new Nearest(i,j,0));
                    visited[i][j]=0;
                }
            }
        }
        int[] r={-1,0,1,0};
        int[] c={0,1,0,-1};
        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int time=q.peek().time;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int rn=row+r[i];
                int cn=col+c[i];
                if(rn>=0 && cn>=0 && rn < n && cn< m && grid[rn][cn]==0 && visited[rn][cn]==0)
                {
                    q.add(new Nearest(rn,cn,time+1));
                    grid[rn][cn]=time+1;
                    visited[rn][cn]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==0)
                {
                    grid[i][j]=0;
                }
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] grid=new int[n][m];
		int edge=sc.nextInt();
		for(int i=0;i<edge;i++)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
			grid[row][col]=1;
		}
		nearest(grid);
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
		sc.close();
	}

}
