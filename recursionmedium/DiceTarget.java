package recursionmedium;

import java.util.Scanner;

public class DiceTarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		print(target,"");
		sc.close();
	}

	private static void print(int target, String string) {
		if(target==0)
		{
			System.out.println(string);
			return;
		}
		for(int i=1;i<=6 && i<=target;i++)
		{
			print(target-i,string + i);
		}
	}

}
