package recursionmedium;

import java.util.Scanner;

public class GeneratAllBinaryBits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n,"");
		sc.close();
	}

	private static void print(int n, String string) {
		if(n==0)
		{
			System.out.println(string);
			return;
		}
		
		print(n-1,string+'0');
		print(n-1,string+'1');
	}
}
