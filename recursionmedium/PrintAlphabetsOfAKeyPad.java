package recursionmedium;

import java.util.Scanner;

public class PrintAlphabetsOfAKeyPad {
	static String keyPad(int n)
	{
		switch(n)
		{
		case 2:
			return "abc";
		case 3:
			return "def";
		case 4:
			return "ghi";
		case 5:
			return "jkl";
		case 6:
			return "mno";
		case 7:
			return "pqrs";
		case 8:
			return "tuv";
		case 9:
			return "wxyz";
		}
		return "";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		printAllPossibleCombinations(key,"");
		sc.close();
	}
	private static void printAllPossibleCombinations(String key, String string) {
		if(key.length()==0)
		{
			System.out.println(string);
			return;
		}
		String s=keyPad(key.charAt(0)-'0');
		for(int i=0;i<s.length();i++)
		{
			printAllPossibleCombinations(key.substring(1),string+s.charAt(i));
		}
		
	}

}
