package graphtraversal;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionInDirectedGraph {
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
		int[] path=new int[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i]==0)
			{
				if(dfs(i,visited,path,adj))
				{
					System.out.println("true");
					return;
				}
			}
		}
		System.out.println("false");
}

	private static boolean dfs(int i, int[] visited,int[] path, ArrayList<ArrayList<Integer>> adj) {
		visited[i]=1;
		path[i]=1;
		for(int j:adj.get(i))
		{
			if(visited[j]==0)
			{
				if(dfs(j,visited,path,adj))
					return true;
			}
			else if(path[j]==1)
				return true;
		}
		path[i]=0;
		return false;
	}
}
