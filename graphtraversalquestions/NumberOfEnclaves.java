package graphtraversalquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfEnclaves {
	 static int enclaves(int n, int m, int a[][])
	    {
	        int[][] visited=new int[n][m];
	        Queue<Pair> q=new LinkedList<>();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(i==0 || j==0 || i==n-1 || j==m-1)
	                {
	                    if(a[i][j]==1)
	                    {
	                        q.add(new Pair(i,j));
	                        visited[i][j]=1;
	                    }
	                }
	            }
	        }
	        int[] r={-1,0,1,0};
	        int[] c={0,1,0,-1};
	        while(!q.isEmpty())
	        {
	            int row=q.peek().row;
	            int col=q.peek().col;
	            q.poll();
	            for(int i=0;i<4;i++)
	            {
	                int rn=row+r[i];
	                int cn=col+c[i];
	                if(rn>=0 && cn>=0 && rn< n && cn<m && a[rn][cn]==1 && visited[rn][cn]==0)
	                {
	                    visited[rn][cn]=1;
	                    q.add(new Pair(rn,cn));
	                }
	            }
	        }
	        int count=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(a[i][j]==1 && visited[i][j]==0)
	                {
	                    count++;
	                }
	            }
	        }
	        return count;
	        // as changes are made directly to objects
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
		System.out.println(enclaves(n,m,grid));
		sc.close();
	}
}
