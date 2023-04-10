package arrays;

import java.util.Scanner;

public class NumberAppearingOnce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=appearingOnce(arr);
		num=appearingOnce2(arr);
		System.out.println(num);
		sc.close();
	}

	private static int appearingOnce(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res^=arr[i];
		}
		return res;
	}
	private static int appearingOnce2(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start + (end-start)/2;
			if(arr[mid]==arr[mid^1])
				start=mid+1;
			else
				end=mid-1;
		}
		return arr[start];
	}

}
