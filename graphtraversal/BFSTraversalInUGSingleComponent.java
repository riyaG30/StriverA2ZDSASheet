package graphtraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversalInUGSingleComponent {

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
		//starting node is 0
		Queue<Integer> q=new LinkedList<>();
		int[] visited=new int[n];
		q.add(0);
		visited[0]=1;
		while(!q.isEmpty())
		{
			int temp=q.poll();
			System.out.print(temp+" ");
			for(int j:adj.get(temp))
			{
				if(visited[j]==0)
				{
					q.add(j);
					visited[j]=1;
				}
			}
		}
		sc.close();
	}

}
