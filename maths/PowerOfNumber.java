package maths;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		//b is the power
		int b=sc.nextInt();
		long power=b;
		int sign=0;
		if(power<0)
			
		{
			sign=-1;
			power*=-1;
		}
		double res=1;
		while(power>0)
		{
			if((power&1)!=0)
			{
				res*=a;
			}
			a*=a;
			power>>=1;
		}
		if(sign<0)
			res = 1.0/res;//Taken care of sign
		System.out.println(res);
		sc.close();
	}

}
