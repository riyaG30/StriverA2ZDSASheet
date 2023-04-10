package graphtraversal;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSTraversalInUG {
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
		int[] visited=new int[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i]==0)
			{
				dfs(i,visited,adj);
			}
		}
		sc.close();
}

	private static void dfs(int i, int[] visited, ArrayList<ArrayList<Integer>> adj) {
		visited[i]=1;
		System.out.print(i+" ");
		for(int j:adj.get(i))
		{
			if(visited[j]==0)
			{
				dfs(j,visited,adj);
			}
		}
	}
}
