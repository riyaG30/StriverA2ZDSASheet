package slidingwindow;

import java.util.Scanner;

public class SubarrayMaximumSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxsubarray(arr,n,sc.nextInt()));
		sc.close();
	}

	private static int maxsubarray(int[] arr, int n,int k) {
		int max=Integer.MIN_VALUE;
		int start=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(i>=k-1)
			{
				max=Math.max(max, sum);
				sum-=arr[start++];
			}
		}
		return max;
	}

}
