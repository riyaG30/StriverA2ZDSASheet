package arrays;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=remove(arr);
		for(int i=0;i<m;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static int remove(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return j+1;
	}
}
