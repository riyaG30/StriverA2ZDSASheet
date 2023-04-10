package arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		secondLargest(arr);
		sc.close();
	}

	private static void secondLargest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i:arr)
		{
			max=Math.max(max, i);
		}
		int secondMax=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i!=max)
				secondMax=Math.max(i, secondMax);
		}
		if(secondMax==Integer.MIN_VALUE)
		{
			System.out.println("-1");
			return;
		}
		System.out.println(secondMax);
	}

}
