package bitmanipulation;

import java.util.Scanner;

public class CountTheNumberOfSetBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
			n = n & n-1;
		}
		System.out.println(count);
		//We can also do it by shifting bits to right by 1 until zero
		sc.close();

	}

}
