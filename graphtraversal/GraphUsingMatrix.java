package graphtraversal;

import java.util.Scanner;

public class GraphUsingMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] adj=new int[n][m];
		int edges=sc.nextInt();
		for(int i=0;i<edges;i++)
		{
			//asking for row and column
			int row=sc.nextInt();
			int col=sc.nextInt();
			
			//Directed
			adj[row][col]=1;
			
			//Undirected
			adj[row][col]=1;
			adj[col][row]=1;
		}
		//Printing the graph
		for(int i=0;i<adj.length;i++)
		{
			System.out.print(i+"->");
			for(int j=0;j<adj[0].length;j++)
			{
				if(adj[i][j]==1)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
