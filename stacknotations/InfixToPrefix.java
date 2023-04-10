package stacknotations;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(infixToPrefix(s));
		sc.close();
		}

	private static String infixToPrefix(String str) {
		Stack<Character> s=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(Character.isAlphabetic(str.charAt(i)))
				sb.append(str.charAt(i));
			else
			{
				if(s.isEmpty() || str.charAt(i)==')' || str.charAt(i)=='^')
					s.push(str.charAt(i));
				else if(str.charAt(i)=='(')
				{
					while(!s.isEmpty() && s.peek()!=')')
					{
						sb.append(s.pop());
					}
					s.pop();
				}
				else if((str.charAt(i)=='*' || str.charAt(i)=='/') && s.peek()=='^')
				{
					while(!s.isEmpty() && s.peek()=='^')
					{
						sb.append(s.pop());
					}
					s.push(str.charAt(i));
				}
				else if((str.charAt(i)=='+' || str.charAt(i)=='-') && (s.peek()=='/' || s.peek()=='*' || s.peek()=='^'))
				{
					while(!s.isEmpty() && (s.peek()=='/' || s.peek()=='*' || s.peek()=='^'))
					{
						sb.append(s.pop());
					}
					s.push(str.charAt(i));
				}
				else
					s.push(str.charAt(i));
			}
		}
		while(!s.isEmpty())
			sb.append(s.pop());
		return sb.reverse().toString();
	}
}
