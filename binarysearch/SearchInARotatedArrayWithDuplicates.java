package binarysearch;

import java.util.Scanner;

public class SearchInARotatedArrayWithDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		sc.close();
		int ans=findPivot(arr,0,arr.length-1);
		if(arr[ans]==key)
		{
			System.out.println(ans);
			return;
		}
		int first=binarySearch(arr,0,ans-1,key);
		if(first==-1)
			first=binarySearch(arr,ans+1,arr.length-1,key);
		System.out.println(first);
	}
	private static int binarySearch(int[] arr, int start, int end,int key) {
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]<key)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	private static int findPivot(int[] arr, int start, int end) {
		while(start<=end)
		{	
			int mid=start + (end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			//If there are duplicates in the front ,back and end
			if(arr[start]==arr[mid] && arr[mid]==arr[end])
			{
				//if start is the pivot
				if(arr[start]>arr[start+1])
					return start;
				start++;
				
				if(arr[end]<arr[end-1])
					return end-1;
				end--;
			}
			else if(arr[start]<arr[mid] ||(arr[mid]==arr[start]) && arr[mid]>arr[end])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
}
