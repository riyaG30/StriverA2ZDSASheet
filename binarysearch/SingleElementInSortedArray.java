package binarysearch;

import java.util.Scanner;

public class SingleElementInSortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("ENter the key");
		int ans=singleElement(arr,0,arr.length-1);
		System.out.println(ans);
		sc.close();
	}

	private static int singleElement(int[] arr, int start, int end) {
		while(start<end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]==arr[mid^1])
				start=mid+1;
			else
				end=mid;
				
		}
		//It can only work if there is one single element in sorted array which appears only once.
		return start;
	}
}
