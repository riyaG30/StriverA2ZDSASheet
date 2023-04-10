package stringmedium;

import java.util.Scanner;

public class LongestPalindromicSubstringBruteForce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(longestPalindrome(s));
		sc.close();
	}
	private static boolean checkPalindrome(String s,int start,int end)
	{
		while(start<=end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	private static String longestPalindrome(String s) {
		String ans="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				if(checkPalindrome(s,i,j+1))
				{
					if(max<j-i+1)
					{
						max=j-i+1;
						ans=s.substring(i,j+1);
					}
				}
			}
		}
		return ans;
	}

}
