package stringmedium;

import java.util.Scanner;

public class AtoiLeetcode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.trim();
		sc.close();
        if(s.isEmpty())
            return ;
		int sign= s.charAt(0)== '-' ? -1 : 1;
		int i= sign == -1 || s.charAt(0)=='+' ? 1 : 0;
		long ans=0;
		
		for(;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)))
				break;
			ans = ans * 10 + (s.charAt(i) - '0');
//            if(ans>Integer.MAX_VALUE)   leetcode edge case
//                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		System.out.println((int)ans*sign);
		
	}

}
