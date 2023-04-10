package graphtraversal;

import java.util.*;

public class GraphUsingArrayList {

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
			
			//for directed
			adj.get(n1).add(n2);
			
			//for undirected
			adj.get(n1).add(n2);
			adj.get(n2).add(n1);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(i+"->");
			for(int j:adj.get(i))
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
