package slidingwindow;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(longest(s));
		sc.close();
	}

	private static int longest(String s) {
		int max=Integer.MIN_VALUE;
		HashSet<Character> hs=new HashSet<>(); 
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			while(hs.contains(s.charAt(i)))
			{
				hs.remove(s.charAt(start++));
			}
			max=Math.max(max, i-start+1);
			hs.add(s.charAt(i));
		}
		return max;
	}
}
