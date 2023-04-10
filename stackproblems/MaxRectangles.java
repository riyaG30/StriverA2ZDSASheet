package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class MaxRectangles {

	public static int[] nextSmallerElementRight(int[] arr,int n)
	{
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		s.push(n-1);
		ans[n-1]=arr.length;
		for(int i=n-2;i>=0;i--)
		{
			while(!s.isEmpty() && arr[i]<=arr[s.peek()])
				s.pop();
			if(s.isEmpty())
				ans[i]=arr.length;
			else
				ans[i]=s.peek();
			s.push(i);
		}
		return ans;
	}
	public static int[] nextSmallerElementLeft(int[] arr,int n)
	{
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		s.push(0);
		ans[0]=-1;
		for(int i=1;i<n;i++)
		{
			while(!s.isEmpty() && arr[i]<=arr[s.peek()])
				s.pop();
			if(s.isEmpty())
				ans[i]=-1;
			else
				ans[i]=s.peek();
			s.push(i);
		}
		return ans;
	}
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
		int max=Integer.MIN_VALUE;
		int[] current=arr[0];
		max=Math.max(max,maxHistogram(current,m));
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==1)
					current[j]+=1;
				else
					current[j]=0;
			}
			max=Math.max(max,maxHistogram(current,m));
		}
		sc.close();

	}
	private static int maxHistogram(int[] arr, int n) {
		int[] rb=nextSmallerElementRight(arr,n);
		int[] lb=nextSmallerElementLeft(arr,n);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			int width=rb[i]-lb[i]-1;
			max=Math.max(max, width*arr[i]);
		}
		return max;
	}

}
