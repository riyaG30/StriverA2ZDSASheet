package arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		largest(arr);
		sc.close();
	}

	private static void largest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i:arr)
		{
			max=Math.max(max, i);
		}
		System.out.println(max);
	}

}
