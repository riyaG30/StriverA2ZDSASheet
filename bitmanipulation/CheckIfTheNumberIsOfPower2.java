package bitmanipulation;

import java.util.Scanner;

public class CheckIfTheNumberIsOfPower2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean powerOfTwo = (n & (n-1)) == 0; 
		System.out.println(powerOfTwo);
		sc.close();

	}

}
