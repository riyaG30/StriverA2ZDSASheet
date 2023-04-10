package recursiondifficult;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		printPermutation(arr,0,arr.length);
		sc.close();
	}
	
	private static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static void printPermutation(int[] arr, int i, int n) {
		if(i==n)
		{
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int j=i;j<n;j++)
		{
			swap(arr,i,j);
			printPermutation(arr,i+1,n);
			swap(arr,i,j);
		}
	}

}
