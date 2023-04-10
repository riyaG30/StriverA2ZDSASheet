package maths;

import java.util.Scanner;
import java.util.TreeSet;

public class AlldivisorsOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Integer> ts=new TreeSet<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                ts.add(i);
                ts.add(n/i);
            }
        }
        for(int i:ts)
            System.out.print(i+" ");
        sc.close();
	}

}
