package arraysmedium;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=arr.length-2;
		while(i>=0 && arr[i]>arr[i+1])
			i--;
		int j=arr.length-1;
		if(i>=0)
		{
			while(j>0 && arr[i]>arr[j])
			{
				j--;
			}
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		reverse(arr,i+1,arr.length-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
