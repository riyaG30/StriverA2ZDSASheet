package recursionmedium;

import java.util.Scanner;

public class CheckIfThereIsASubsetSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(subset(arr,0,10));
		sc.close();
	}

	private static boolean subset(int[] arr, int index, int key) {
		if(index==arr.length)
		{
			if(key==0)
			{
				return true;
			}
			return false;
		}
		if(subset(arr,index+1,key-arr[index]))
			return true;
		return subset(arr,index+1,key);
	}
}
