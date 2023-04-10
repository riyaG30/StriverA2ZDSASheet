package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementRight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(nextSmallerElementRight(arr,n));
		sc.close();
	}
	public static int[] nextSmallerElementRight(int[] arr,int n)
	{
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		s.push(arr[n-1]);
		ans[n-1]=-1;
		for(int i=n-2;i>=0;i--)
		{
			while(!s.isEmpty() && arr[i]<=s.peek())
				s.pop();
			if(s.isEmpty())
				ans[i]=-1;
			else
				ans[i]=s.peek();
			s.push(arr[i]);
		}
		return ans;
	}
	
}
