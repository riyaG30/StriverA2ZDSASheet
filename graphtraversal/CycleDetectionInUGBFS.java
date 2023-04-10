package graphtraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair
{
	int child;
	int parent;
	public Pair(int c,int p)
	{
		child=c;
		parent=p;
	}
}
public class CycleDetectionInUGBFS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<>());
		}
		//Number of edges
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			
			//for undirected
			adj.get(n1).add(n2);
			adj.get(n2).add(n1);
		}
		sc.close();
		int[] visited=new int[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i]==0)
			{
				if(bfs(i,visited,adj))
				{
					System.out.println("true");
					return;
				}
			}
		}
		System.out.println("false");
}

	private static boolean bfs(int i,int[] visited, ArrayList<ArrayList<Integer>> adj) {
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,-1));
		visited[i]=1;
		while(!q.isEmpty())
		{
			Pair temp=q.poll();
			int child=temp.child;
			int parent=temp.parent;
//			System.out.print(temp+" ");
			for(int j:adj.get(child))
			{
				if(visited[j]==0)
				{
					q.add(new Pair(j,child));
					visited[j]=1;
				}
				else if(j!=parent)
					return true;
			}
		}
		return false;
	}
}
