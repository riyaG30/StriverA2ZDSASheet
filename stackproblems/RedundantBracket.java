package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(redundantBrackets(s));
		sc.close();
	}

	private static boolean redundantBrackets(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==')')
			{
				if(st.peek()=='(')
					return true;
				while(!st.isEmpty() && st.peek()!='(')
				{
					st.pop();
				}
				st.pop();
			}
			else
				st.push(s.charAt(i));
		}
		return false;
	}
	
}
