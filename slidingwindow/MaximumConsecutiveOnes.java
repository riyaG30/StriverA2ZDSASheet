package slidingwindow;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(maxOnes(arr,n,sc.nextInt()));
		sc.close();
	}

	private static int maxOnes(int[] arr, int n,int m) {
		int j=-1;
		int max=Integer.MIN_VALUE,count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				count++;
			while(count>m)
			{
				j++;
				if(arr[j]==0)
					count--;
			}
			max=Math.max(max, i-j);
		}
		return max;
	}
}
