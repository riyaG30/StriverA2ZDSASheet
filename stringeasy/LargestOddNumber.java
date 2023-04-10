package stringeasy;

import java.util.Scanner;

public class LargestOddNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)-'0')%2!=0)
            {
                System.out.println(s.substring(0,i+1));
                return;
            }
        }
        System.out.println(" ");
        sc.close();
	}

}
