package binarysearchhard;

import java.util.Scanner;

public class SquareOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=findSquare(n);
		System.out.println(ans);
		sc.close();
	}

	private static int findSquare(int n) {
		int low=0;
		int high=n;
		int ans=0;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(mid*mid==n)
				return mid;
			else if(mid*mid>n)
				high=mid-1;
			else
			{
				ans=mid;
				low=mid+1;
			}
		}
		if(n==0 || n==1)
			return n;
		return ans;
	}

}
