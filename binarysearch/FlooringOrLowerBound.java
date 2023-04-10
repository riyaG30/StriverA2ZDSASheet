package binarysearch;

import java.util.Scanner;

public class FlooringOrLowerBound {
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
		int ans=binarySearchFloor(arr,0,arr.length-1,key);
		System.out.println(ans);
		sc.close();
	}

	private static int binarySearchFloor(int[] arr, int start, int end,int key) {
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
		//as after start<=end end moves towards the lower index hence used for flooring
		return end;
	}
}
