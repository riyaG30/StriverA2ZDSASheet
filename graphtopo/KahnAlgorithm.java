package graphtopo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class KahnAlgorithm {

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
		int[] indegree=new int[n];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			for(int j:adj.get(i))
			{
				indegree[j]++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		List<Integer> ans=new ArrayList<>();
		while(!q.isEmpty())
		{
			int temp=q.poll();
			ans.add(temp);
			for(int j:adj.get(temp))
			{
				indegree[j]--;
				if(indegree[j]==0)
				{
					q.add(j);
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
