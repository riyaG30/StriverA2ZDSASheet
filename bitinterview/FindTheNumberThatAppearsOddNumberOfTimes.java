package bitinterview;

import java.util.Scanner;

public class FindTheNumberThatAppearsOddNumberOfTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//All numbers have duplicates except one
		int res=0;
		for(int i=0;i<n;i++)
		{
			res^=arr[i];
		}
		System.out.println(res);
		sc.close();
	}

}
