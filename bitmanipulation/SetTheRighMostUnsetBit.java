package bitmanipulation;

import java.util.Scanner;

public class SetTheRighMostUnsetBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n * 2< (n | n+1))
			return ;
		System.out.println(n| n+1);
	}

}
