package recursionmedium;

import java.util.Scanner;

public class CountAllSubsetWithSumK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(subset(arr,0,3));
		sc.close();
	}

	private static int subset(int[] arr, int index, int key) {
		if(index==arr.length)
		{
			if(key==0)
			{
				return 1;
			}
			return 0;
		}
		int count=0;
		count+=subset(arr,index+1,key-arr[index]);
		count+=subset(arr,index+1,key);
		return count;
	}
}
