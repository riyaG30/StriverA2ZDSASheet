package arraysmedium;

import java.util.Scanner;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max_sum=subArraySum(arr);
		System.out.println(max_sum);
		sc.close();

	}

	private static int subArraySum(int[] arr) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			max=Math.max(sum, max);
			if(sum<0)
				sum=0;
		}
		return max;
	}

}
