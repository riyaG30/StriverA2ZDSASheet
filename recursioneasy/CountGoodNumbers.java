package recursioneasy;

import java.util.Scanner;

public class CountGoodNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//There are 5 digits which are even 0 2 4 6 8 and 4 prime 2 3 5 7
        //For one there can be only even number because at zero index we can have only even nos
        //n=1 hence the answer will be 5 ^ 1 + 4^0;
        //n is the digits
		int a=n>>1;
		int b=(n+1)>>1;
		System.out.println((int)(Math.pow(5, b) * Math.pow(4, a)));
		//for n=2
		//There are 10-99 two digits numbers. 
		//10 11  12 13 14 15  16 18 20 21 
		//Summarizing that if there is one index then we can place 5 even number if there are _ _ we can 4 primes and five even numbers
		// 5^(n+1)>>1 * 4^(n)>>1;
		sc.close();
	}

}
