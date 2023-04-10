package graphtraversalquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FloodFillAlgorithm {

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
		int rd=sc.nextInt(),cd=sc.nextInt();
		int newColor=sc.nextInt();
		int initial=adj[rd][cd];
//		int initial=adj[sr][sc];
        int[][] visited=new int[n][m];
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(rd,cd));
		adj[rd][cd]=newColor;
		visited[rd][cd]=1;
		int[] r= {-1,0,1,0};
		int[] c= {0,1,0,-1};
		while(!q.isEmpty())
		{
			Pair rot=q.poll();
			int row=rot.row;
			int col=rot.col;
			for(int i=0;i<4;i++)
			{
				int rn=row+r[i];
				int cn=col+c[i];
				if(rn>=0 && cn>=0 && rn < adj.length && cn < adj[0].length && adj[rn][cn]==initial && visited[rn][cn]==0)
				{
					visited[rn][cn]=1;
					adj[rn][cn]=newColor;
					q.add(new Pair(rn,cn));
				}
			}
		}
//		return adj;
		sc.close();

	}

}
