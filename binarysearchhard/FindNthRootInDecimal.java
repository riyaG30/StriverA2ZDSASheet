package binarysearchhard;

import java.util.Scanner;

public class FindNthRootInDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//num
		int num=sc.nextInt();
		//power
		int power=sc.nextInt();
		double ans=findRoot(num,power);
		System.out.println(ans);
		sc.close();

	}

	private static double findRoot(int num, int power) {
		double low=0;
		double high=num;
		double eps=1e-6;
		while(high-low>eps)
		{
			double mid=low+(high-low)/2;
			double ans=Math.pow(mid, power);
			if(ans>num)
				high=mid;
			else
				low=mid;
		}
		return high;
	}

}
