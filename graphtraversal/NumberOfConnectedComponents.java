package graphtraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfConnectedComponents {
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
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(visited[i]==0)
			{
				count++;
				bfs(i,visited,adj);
			}
		}
		System.out.println(count);
		sc.close();
}

	private static void bfs(int i, int[] visited, ArrayList<ArrayList<Integer>> adj) {
		Queue<Integer> q=new LinkedList<>();
		q.add(i);
		visited[i]=1;
		while(!q.isEmpty())
		{
			int temp=q.poll();
//			System.out.print(temp+" ");
			for(int j:adj.get(temp))
			{
				if(visited[j]==0)
				{
					q.add(j);
					visited[j]=1;
				}
			}
		}
	}
}
