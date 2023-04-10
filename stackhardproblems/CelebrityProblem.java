package stackhardproblems;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

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
		System.out.println(celebrity(arr));
		sc.close();
	}

	private static int celebrity(int[][] arr) {
		int ans=-1;
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			s.push(i);
		}
		while(s.size()>=2)
		{
			int a=s.pop();
			int b=s.pop();
			if(arr[a][b]==1)
				s.push(b);
			else
				s.push(a);
		}
		ans=s.pop();
		for(int i=0;i<arr.length;i++)
		{
			if(i!=ans)
				if(arr[ans][i]==1 || arr[i][ans]==0)
					return -1;
		}
		return ans;
	}

}
