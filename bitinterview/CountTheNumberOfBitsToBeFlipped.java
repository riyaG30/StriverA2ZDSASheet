package bitinterview;

import java.util.Scanner;

public class CountTheNumberOfBitsToBeFlipped {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int res=0;
		res=n^m;
		// 0 1 -> 1
		int count=0;
		while(res>0)
		{
			count++;
			res = res & res-1;
		}
		System.out.println(count);
		sc.close();
	}

}
