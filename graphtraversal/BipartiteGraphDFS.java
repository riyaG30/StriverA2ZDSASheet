package graphtraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BipartiteGraphDFS {
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
		sc.close();
		Arrays.fill(visited, -1);
		for(int i=0;i<n;i++)
		{
			if(dfs(0,visited,adj)==false)
			{
				System.out.println("Not a bipartite Graph");
				return;
			}
		}
		System.out.println("Bipartite Graph");
	}

	private static boolean dfs(int i, int[] visited, ArrayList<ArrayList<Integer>> adj) {
		if(visited[i]==-1)
			visited[i]=1;
		for(int j:adj.get(i))
		{
			if(visited[j]==-1)
			{
				visited[j]=1-visited[i];
				if(dfs(j,visited,adj)==false)
					return false;
			}
			else if(visited[i]==visited[j])
				return false;
		}
		return true;
	}
}
