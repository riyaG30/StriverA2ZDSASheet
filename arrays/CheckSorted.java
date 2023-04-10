package arrays;

import java.util.Scanner;

public class CheckSorted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(sorted(arr));
		sc.close();
	}

	private static boolean sorted(int[] arr) {
		if(arr.length==0)
			return true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}
}
