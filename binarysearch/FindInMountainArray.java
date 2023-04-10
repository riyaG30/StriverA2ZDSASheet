package binarysearch;

import java.util.Scanner;

public class FindInMountainArray {
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
		int ans=searchInMountain(arr,0,arr.length-1,key);
		System.out.println(ans);
		sc.close();
	}
	
	private static int searchInMountain(int[] arr, int i, int j, int key) {
		int peak=findPeak(arr,i,j);
		int first=agnosticBinarySearch(arr,i,peak,key);
		if(first!=-1)
			return first;
		return agnosticBinarySearch(arr,peak+1,j,key);
	}

	private static int findPeak(int[] arr, int start, int end) {
		//wherever our start and end become equal that is peak element
		while(start<end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]<arr[mid+1])
				start=mid+1;
			else
				end=mid;
			//end is considered to be mid as if arr[start]<arr[mid] then mid can be a potential answer.
		}
		return start;
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
