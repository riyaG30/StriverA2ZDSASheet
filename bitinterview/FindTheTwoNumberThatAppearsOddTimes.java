package bitinterview;

import java.util.Scanner;

public class FindTheTwoNumberThatAppearsOddTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//In this the array may contains 1 1 1 2 2 3 3 3 All the number appear except 3 and 2 appear even times
		int res=0;
		for(int i:arr)
			res^=i;
		res = res & -res;
		int x=0,y=0;
		for(int i:arr)
		{
			if((i&res)!=0)
				x^=i;
			else
				y^=i;
		}
		System.out.println(x+" "+y);
		sc.close();

	}

}
