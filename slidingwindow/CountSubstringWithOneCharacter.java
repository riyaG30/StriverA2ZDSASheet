package slidingwindow;

import java.util.Scanner;

public class CountSubstringWithOneCharacter {
	public static int count(String s)
	{
		int a=0,b=0,c=0;
		int count=0;
		int j=0;
		for(int i=0;i<s.length();j++)
		{
			if(s.charAt(i)=='a')
				a++;
			else if(s.charAt(i)=='b')
				b++;
			else
				c++;
			while(a>0 && b>0 && c>0)
			{
				count+=s.length()-i;
				if(s.charAt(j)=='a')
					a--;
				else if(s.charAt(j)=='b')
					b--;
				else
					c--;
				j++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(count(s));
		sc.close();
	}

}
