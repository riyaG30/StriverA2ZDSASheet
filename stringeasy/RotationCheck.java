package stringeasy;

import java.util.Scanner;

public class RotationCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		if(s1.length()!=s2.length())
			return;
		s1=s1+s1;
		System.out.println(s1.contains(s2));
	}

}
