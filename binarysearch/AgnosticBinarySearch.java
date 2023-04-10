package binarysearch;

import java.util.Scanner;

public class AgnosticBinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("ENter the key");
		int key=sc.nextInt();
		int ans=agnosticBinarySearch(arr,0,arr.length-1,key);
		System.out.println(ans);
		sc.close();
	}

	private static int agnosticBinarySearch(int[] arr, int start, int end,int key) {
		boolean flag=arr[start]<=arr[end];
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]==key)
				return mid;
			if(flag)
			{
				if(arr[mid]<key)
					start=mid+1;
				else
					end=mid-1;
			}
			else
			{
				if(arr[mid]<key)
					end=mid-1;
				else
					start=mid+1;
			}
		}
		return -1;
	}
}
