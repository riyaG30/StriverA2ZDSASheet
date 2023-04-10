package binarysearch;

import java.util.Scanner;

public class FindPeakElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=findPeak(arr,0,arr.length-1);
		System.out.println(ans);
		sc.close();
	}

	private static int findPeak(int[] arr, int start, int end) {
		//wherever our start and end become equal that is peak element
		//Peak element is the element where the increasing stops and decreasing starts
		//        1 3 5 3 1 ->5
		while(start<end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]<arr[mid+1])
				start=mid+1;
			else
				end=mid;
			//end is considered to be mid as if arr[start]<arr[mid] then mid can be a potential answer.
		}
		return arr[start];
	}
}
