package binarysearchhard;

import java.util.Scanner;

public class NthRootOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//num
		int num=sc.nextInt();
		//power
		int power=sc.nextInt();
		int ans=findRoot(num,power);
		System.out.println(ans);
		sc.close();
	}

	private static int findRoot(int num, int power) {
		//Only perfect allowed
		int low=0;
		int high=num;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			int ans=(int)Math.pow(mid,power);
			if(ans==num)
			{
				return mid;
			}
			else if(ans>num)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}

}
