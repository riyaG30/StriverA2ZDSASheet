package arraysmedium;

import java.util.Scanner;

public class MaximumSubarraySum {
	//In this question you find the sum of the smallest and second smalled subarray->subarrays are consecutive
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max_sum=subarraySum(arr);
		System.out.println(max_sum);
		sc.close();
	}

	private static int subarraySum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]+arr[i-1]);
		}
		if(max==Integer.MIN_VALUE)
			return -1;
		return max;
	}

}
