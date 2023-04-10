package arrayshard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArraysWithoutSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			arr2[j]=sc.nextInt();
		}
		rearrange(arr,arr2);
		for(int i:arr)
			System.out.print(i+" ");
		for(int i:arr2)
			System.out.print(i+" ");
		sc.close();
	}

	private static void rearrange(int[] arr, int[] arr2) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr2[0])
			{
				int temp=arr[i];
				arr[i]=arr2[0];
				arr2[0]=temp;
			}
			Arrays.sort(arr2);
		}
		
	}
}
