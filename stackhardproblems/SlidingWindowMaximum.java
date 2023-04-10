package stackhardproblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(Arrays.toString(sliding(arr,n,k)));
		sc.close();
	}
	private static int[] nextGreaterElement(int[] arr, int n) {
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		//Next greater for the element at the last position will be -1 
		ans[n-1]=arr.length;
		s.push(n-1);
		//We will iterate from the second last position
		for(int i=n-2;i>=0;i--)
		{
			while(!s.isEmpty() && arr[i]>=arr[s.peek()])
			{
				s.pop();
			}
			if(s.isEmpty())
				ans[i]=arr.length;
			else
				ans[i]=s.peek();
			s.push(i);
		}
		return ans;
	}
	private static int[] sliding(int[] arr, int n ,int k) {
		int[] ans=new int[n-k+1];
		int[] nge=nextGreaterElement(arr,n);
		for(int i=0;i<=n-k;i++)
		{
			int j=i;
			//nge[j] will move with the index and as soon as it moves of the window size we have the maximum value in that particular index
			while(nge[j]<i+k)
			{
				j=nge[j];
			}
			ans[i]=arr[j];
		}
		return ans;
	}
}
