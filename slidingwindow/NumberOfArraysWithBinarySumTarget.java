package slidingwindow;

import java.util.Scanner;

public class NumberOfArraysWithBinarySumTarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(binarySubarray(arr,n,sc.nextInt()));
		sc.close();
	}

	private static int binarySubarray(int[] arr, int n, int target) {
		return count(arr,n,target)-count(arr,n,target-1);
	}

	private static int count(int[] arr, int n, int target) {
		int count=0;
		int start=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			while(sum>target)
			{
				sum-=arr[start++];
			}
			count+=(i-start+1);
		}
		return count;
	}

}
