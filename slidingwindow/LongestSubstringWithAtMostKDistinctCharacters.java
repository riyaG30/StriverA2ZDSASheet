package slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithAtMostKDistinctCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(longest(s,sc.nextInt()));
		sc.close();
	}

	private static int longest(String s,int k) {
		int max=Integer.MIN_VALUE;
		HashMap<Character,Integer> map=new HashMap<>();
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
			if(map.keySet().size()>k)
			{
				if(map.get(s.charAt(start))==1)
					map.remove(s.charAt(start));
				else
					map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0)-1);
				start++;
			}
			if(map.keySet().size()==k)
				max=Math.max(max, i-start+1);
		}
		
		return max;
	}

}
