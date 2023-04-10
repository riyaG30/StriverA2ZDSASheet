package slidingwindow;

import java.util.Scanner;

public class LongestRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		System.out.println(longest(s,k));
		sc.close();
	}

	private static int longest(String s,int k) {
		int start=0,maxlength=0,maxcount=0;
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++)
		{
			maxcount=Math.max(maxcount,++arr[s.charAt(i)]-'A');
			if(i-start+1-maxcount>k)
			{
				arr[s.charAt(start++)-'A']--;
			}
			maxlength=Math.max(maxlength, i-start+1);
		}
		return maxlength;
	}

}
