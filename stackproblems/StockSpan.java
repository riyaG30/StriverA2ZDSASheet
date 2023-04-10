package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(stockSpan(arr,n));
		sc.close();
	}

	private static int[] stockSpan(int[] arr, int n) {
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<n;i++)
		{
			//as we are using index hence
			while(!s.isEmpty() && arr[i]>=arr[s.peek()])
			{
				s.pop();
			}
			if(s.isEmpty())
				ans[i]=i+1;
			else
				ans[i]=i-s.peek();
			s.push(i);
		}
		return ans;
	}
	
}
