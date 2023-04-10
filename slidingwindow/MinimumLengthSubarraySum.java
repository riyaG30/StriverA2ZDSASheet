package slidingwindow;

import java.util.Scanner;

public class MinimumLengthSubarraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(minimumSubArrayWithGivenSum(arr,n,sc.nextInt()));
		sc.close();
	}

	private static int minimumSubArrayWithGivenSum(int[] arr, int n, int target) {
		int sum=0,j=0;
		int max=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			while(sum>=target)
			{
				max=Math.min(max, i-j+1);
				sum-=arr[j++];
			}
		}
		return max;
	}
}
