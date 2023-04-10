package slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(minimumWindow(s,sc.next()));
		sc.close();
	}

	private static String minimumWindow(String s, String p) {
		HashMap<Character,Integer> map=new HashMap<>();
		HashMap<Character,Integer> map1=new HashMap<>();
		for(int i=0;i<p.length();i++)
		{
			map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0)+1);
		}
		int count=0,j=0,i=0;
		String ans="";
		while(true)
		{
			boolean f1=false;
			boolean f2=false;
			while(i<s.length() && count<p.length())
			{
				f1=true;
				map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
				if(map.get(s.charAt(i))<=map1.getOrDefault(s.charAt(i), 0))
					count++;
				i++;
			}
			//Getting the string
			while(j<i && count==p.length())
			{
				f2=true;
				//i is already incremented in above loop
				String ans1=s.substring(j,i);
				if(ans.length()==0 || ans1.length()<ans.length())
				{
					ans1=ans;
				}
				if(map.get(s.charAt(j))==1)
					map.remove(s.charAt(j));
				else
					map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)-1);
				if(map.getOrDefault(s.charAt(j),0)<map1.getOrDefault(s.charAt(j),0))
					count--;
				j++;
			}
			if(!f1 && !f2)
				break;
		}
		return ans;
	}

}
