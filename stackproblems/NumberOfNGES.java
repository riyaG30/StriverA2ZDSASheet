package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class NumberOfNGES {
	 public static int nextLargerElement(int[] arr, int n,int k)
	    { 
	        Stack<Integer> s=new Stack<>();
	        s.push(arr[n-1]);
	        // System.out.println(s);
	        for(int i=n-2;i>=0;i--)
	        {
	            while(!s.isEmpty() && arr[k]>=s.peek())
	                s.pop();
	            if(i==k)
	                return s.size();
	            s.push(arr[i]);
	        }
	        return 0;
	    } 
	  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
	        int[] ans=new int[queries];
	        for(int i=0;i<queries;i++)
	        {
	            ans[i]=nextLargerElement(arr,N,indices[i]);
	        }
	     return ans;
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(count_NGEs(n,arr,2,new int[] {sc.nextInt(),sc.nextInt()}));
		sc.close();

	}

}
