package arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index=binarySearch(arr,key);
		sc.close();
		if(index==-1)
		{
			System.out.println("Key not found");
			return;
		}
		System.out.println("Key found at index "+index);
	}

	private static int binarySearch(int[] arr, int key) {
		int start=0,end=arr.length-1;
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}

}
