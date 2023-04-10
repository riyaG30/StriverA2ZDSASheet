package arrays;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		leftRotate(arr,k);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

	private static void leftRotate(int[] arr,int k) {
		if(arr.length==1)
			return;
		k%=arr.length;
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
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
