package stackproblems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(validParanthesis(s));
		sc.close();
	}

	private static boolean validParanthesis(String s) {
		if(s.length()%2!=0)
			return false;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				st.push(s.charAt(i));
			else
			{
				if((s.charAt(i)==')' && st.peek()=='(') || (s.charAt(i)==']' && st.peek()=='[') || (s.charAt(i)=='}' && st.peek()=='{'))
					st.pop();
				else
					return false;
			}
		}
		return true;
	}

}
