package binarysearch;

import java.util.Scanner;

public class MinimumInAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=findPivot(arr,0,arr.length-1);
		sc.close();
		if(ans==-1)
		{
			System.out.println(arr[0]);
			return;
		}
		System.out.println(arr[ans+1]);
		
	}

	private static int findPivot(int[] arr, int start, int end) {
		while(start<=end)
		{	
			int mid=start + (end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			if(arr[start]<arr[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
}
