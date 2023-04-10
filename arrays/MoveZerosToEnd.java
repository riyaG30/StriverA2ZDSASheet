package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		remove(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void remove(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				arr[k++]=arr[i];
		}
		for(int i=k;i<arr.length;i++)
		{
			arr[i]=0;
		}
	}

}
