package bitmanipulation;

import java.util.Scanner;

public class ClearTheIthBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		int bit = n & ~(1<<(i-1));
		//~ inverts all the bits 
		System.out.println(bit);
		sc.close();

	}

}
