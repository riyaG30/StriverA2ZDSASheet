package arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index=linearSearch(arr,key);
		sc.close();
		if(index==-1)
		{
			System.out.println("Key not found");
			return;
		}
		System.out.println("Key found at index "+index);
	}

	private static int linearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
}
