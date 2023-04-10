package binarysearch;

import java.util.Scanner;

public class FindPivot {
	//The array will be rotated hence 3 5 1 2 3 pivot of this array will be 5.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=findPivot(arr,0,arr.length-1);
		System.out.println(ans);
		sc.close();
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
