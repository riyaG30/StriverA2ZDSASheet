package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementLeft {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(nextSmallerElementLeft(arr,n));
		sc.close();
	}
	public static int[] nextSmallerElementLeft(int[] arr,int n)
	{
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		s.push(arr[0]);
		ans[0]=-1;
		for(int i=1;i<n;i++)
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
