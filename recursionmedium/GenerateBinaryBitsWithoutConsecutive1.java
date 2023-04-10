package recursionmedium;

import java.util.Scanner;

public class GenerateBinaryBitsWithoutConsecutive1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print1(n,"");
		sc.close();
	}

	private static void print1(int n, String string) {
		
		//We can also use stringBuilder as well
		print(n-1,string+'0');
//		System.out.println(string); empty
		print(n-1,string+'1');
	}

	private static void print(int index, String string) {
		if(index==0)
		{
			System.out.println(string);
			return;
		}
		
		if(string.charAt(string.length()-1)=='0')
		{
			print(index-1,string+'0');
			print(index-1,string+'1');
		}
		else 
			print(index-1,string+'0');
	}

}
