package stackhardproblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair
{
	int row;
	int col;
	int time;
	public Pair(int r,int c,int t)
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
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(rottenOranges(arr,n,m));
		sc.close();
	}

	private static int rottenOranges(int[][] arr, int n, int m) {
		int countOfFresh=0;
		Queue<Pair> q=new LinkedList<>();
		int[][] visited=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==2)
				{
					q.add(new Pair(i,j,0));
					visited[i][j]=1;
				}
				if(arr[i][j]==1) 
					countOfFresh++;
			}
		}
		int count=0;
		int[] row= {1,0,-1,0};
		int[] col= {0,-1,0,1};
		int time=-1;
		while(!q.isEmpty())
		{
			Pair p=q.poll();
			for(int i=0;i<4;i++)
			{
				int rn=p.row + row[i];
				int cn=p.col + col[i];
				if(rn>=0 && cn>=0 && rn<n && cn<m && arr[rn][cn]==1 && visited[rn][cn]==0)
				{
					visited[rn][cn]=1;
					q.add(new Pair(rn,cn,p.time+1));
					count++;
					time=Math.max(time, p.time+1);
				}
			}
		}
		if(count==countOfFresh)
			return time;
		return -1;
	}

}
