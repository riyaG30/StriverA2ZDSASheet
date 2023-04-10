package binarysearch;

import java.util.Scanner;

public class CountOccurencesInSortedArray {
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
		int ans=findOccurence(arr,0,arr.length-1,key);
		System.out.println(ans);
		sc.close();
	}

	private static int findOccurence(int[] arr, int start, int end, int key) {
		int first=-1,second=-1;
		first=binarySearch(arr,start,end,key,true);
		second=binarySearch(arr,start,end,key,false);
		if(first==-1)
			return 1;
		return second-first+1;
	}

	private static int binarySearch(int[] arr, int start, int end,int key,boolean flag) {
		int ans=-1;
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]==key)
			{
				ans=mid;
				if(flag)
				{
					end=mid-1;
				}
				else
					start=mid+1;
			}
			else if(arr[mid]<key)
				start=mid+1;
			else
				end=mid-1;
		}
		return ans;
	}
}
