package slidingwindow;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		System.out.println(checkAnagram(s,p));
		sc.close();
	}

	private static ArrayList<Integer> checkAnagram(String s, String p) {
		ArrayList<Integer> ans=new ArrayList<>();
		int[] arr=new int[26];
		for(int i=0;i<p.length();i++)
		{
			arr[p.charAt(i)-'a']++;
		}
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			arr[s.charAt(i)-'a']--;
			if(i>=p.length()-1)
			{
				for(int j=0;j<26;j++)
				{
					if(arr[j]!=0)
						flag=1;
				}
				if(flag==0)
					ans.add(start);
				arr[s.charAt(start)-'a']++;
				start++;
			}
		}
		return ans;
	}

}
