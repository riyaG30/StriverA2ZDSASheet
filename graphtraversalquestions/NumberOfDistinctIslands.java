package graphtraversalquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfDistinctIslands {
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
		int[][] visited=new int[n][m];
		HashSet<ArrayList<String>> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(adj[i][j]==1 && visited[i][j]==0)
				{
					ArrayList<String> ans=new ArrayList<>();
					bfs(i,j,visited,adj,i,j,ans);
					hs.add(ans);
				}
			}
		}
		System.out.println(hs.size());
		sc.close();
	}

	private static void bfs(int i, int j, int[][] visited, int[][] adj,int basei,int basej,ArrayList<String> ans) {
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,j));
		visited[i][j]=1;
		int[] r={-1,0,1,0};
		int[] c={0,1,0,-1};
		while(!q.isEmpty())
		{
			int row=q.peek().row;
			int col=q.peek().col;
			ans.add(""+(row-basei)+(col-basej));
			q.poll();
			for(int k=0;k<4;k++)
            {
				int rn=row+r[k];
				int cn=col+c[k];
				if(rn>=0 && cn>=0 && rn < adj.length && cn < adj[0].length && adj[rn][cn]==1 && visited[rn][cn]==0)
				{
					visited[rn][cn]=1;
					q.add(new Pair(rn,cn));
				}
			}
		}
	}
}
