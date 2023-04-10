package arrays;

import java.util.Scanner;

public class FindMissingNumberUsingSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int missing=findMissing(arr,arr.length);
		System.out.println(missing);
		sc.close();
	}

	private static int findMissing(int[] arr, int length) {
		int sum1=length * (length+1)/2;
		int sum=0;
		for(int i=0;i<length;i++)
		{
			sum+=arr[i];
		}
		return sum1-sum;
	}
}
