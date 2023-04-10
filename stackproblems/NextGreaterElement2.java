package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(nextGreaterElement(arr,n));
		sc.close();
	}

	private static int[] nextGreaterElement(int[] arr, int n) {
		int[] ans=new int[n];
		Stack<Integer> s=new Stack<>();
		//Next greater for the element at the last position will be -1 
		//We will iterate from the second last position
		for(int i=2*n-1;i>=0;i--)
		{
			while(!s.isEmpty() && arr[i%n]>=s.peek())
			{
				s.pop();
			}
			if(i<n)
			{
				if(s.isEmpty())
					ans[i]=-1;
				else
					ans[i]=s.peek();
			}
			s.push(arr[i%n]);
		}
		return ans;
	}


}
