package graphtraversalquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Rotten
{
	int row;
	int col;
	int time;
	public Rotten(int r,int c,int t)
	{
		row=r;
		col=c;
		time=t;
	}
}
public class RottenOranges {
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
		Queue<Rotten> q=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(adj[i][j]==2 && visited[i][j]==0)
				{
					q.add(new Rotten(i,j,0));
					visited[i][j]=1;
				}
				if(adj[i][j]==1)
					count++;
					
			}
		}
		int max=-1;
		int[] r= {-1,0,1,0};
		int[] c= {0,1,0,-1};
		while(!q.isEmpty())
		{
			Rotten rot=q.poll();
			int row=rot.row;
			int col=rot.col;
			int time=rot.time;
			max=Math.max(max, time);
			for(int i=0;i<4;i++)
			{
				int rn=row+r[i];
				int cn=col+c[i];
				if(rn>=0 && cn>=0 && rn < adj.length && cn < adj[0].length && adj[rn][cn]==1 && visited[rn][cn]==0)
				{
					visited[rn][cn]=1;
					count--;
					q.add(new Rotten(rn,cn,time+1));
				}
			}
		}
		if(count==0)
			System.out.println(max);
//		return max;
		sc.close();
	}
}
