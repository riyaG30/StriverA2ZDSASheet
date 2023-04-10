package graphtraversalquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair
{
	int row;
	int col;
	public Pair(int r,int c)
	{
		row=r;
		col=c;
	}
}
public class NumberOfIslands {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] adj=new int[n][m];
		int edge=sc.nextInt();
		for(int i=0;i<edge;i++)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
			adj[row][col]=1;
		}
		int count=0;
		int[][] visited=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(adj[i][j]==1 && visited[i][j]==0)
				{
					count++;
					bfs(i,j,visited,adj);
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static void bfs(int i, int j, int[][] visited, int[][] adj) {
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,j));
		visited[i][j]=1;
		while(!q.isEmpty())
		{
			int row=q.peek().row;
			int col=q.peek().col;
			q.poll();
			for(int r=-1;r<=1;r++)
			{
				for(int c=-1;c<=1;c++)
				{
					int rn=row+r;
					int cn=col+c;
					if(rn>=0 && cn>=0 && rn < adj.length && cn < adj[0].length && adj[rn][cn]==1 && visited[rn][cn]==0)
					{
						visited[rn][cn]=1;
						q.add(new Pair(rn,cn));
					}
				}
			}
		}
	}

}
