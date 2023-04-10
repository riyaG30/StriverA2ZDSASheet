package stackproblems;

import java.util.*;

public class MinimumNumberOfReversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reversal(s));
		sc.close();
	}
	public static int reversal(String s)
	{
		if(s.length()%2!=0)
			return -1;
		Stack<Character> s1=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='}' && s1.peek()=='{')
				s1.pop();
			else
				s1.push(s.charAt(i));
		}
		int open=0,close=0;
		while(!s1.isEmpty())
		{
			if(s1.peek()=='{')
				open++;
			else
				close++;
			s1.pop();
		}
		return (open+1)/2 + (close+1)/2;
	}
}
