package bitmanipulation;

import java.util.Scanner;

public class SetTheIthBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		int bit = n | (1<<(i-1)); 
		System.out.println(bit);
		sc.close();
	}

}
