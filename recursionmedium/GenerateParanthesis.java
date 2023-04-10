package recursionmedium;

import java.util.Scanner;

public class GenerateParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n,"(",1,0);
		sc.close();
	}

	private static void print(int index, String string, int open,int close) {
		if(string.length()==2*index)
		{
			System.out.println(string);
			return;
		}
		if(open<index)
			print(index,string+'(',open+1,close);
		if(close<open)
			print(index,string+')',open,close+1);
	}

}
