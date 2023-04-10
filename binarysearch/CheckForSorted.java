package binarysearch;

import java.util.Scanner;

public class CheckForSorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("ENter the key");
		boolean ans=checkSorted(arr,0,arr.length-1);
		System.out.println(ans);
		sc.close();

	}

	private static boolean checkSorted(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}

}
