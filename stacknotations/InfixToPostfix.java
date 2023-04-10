package stacknotations;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static String infixToPostfix(String exp) {
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<exp.length();i++)
        {
            if(Character.isAlphabetic(exp.charAt(i)))
            {
                sb.append(exp.charAt(i));
            }
            else
            {
                if(s.isEmpty() || exp.charAt(i)=='^' ||exp.charAt(i)=='(')
                {
                    s.push(exp.charAt(i));
                }
                else  if(exp.charAt(i)==')')
                {
                    while(s.peek()!='(')
                    {
                        sb.append(s.pop());
                    }
                    s.pop();//for the opening bracket which is in the stack
                }
                else if((exp.charAt(i)=='*' || exp.charAt(i)=='/') && (s.peek()=='+' || s.peek()=='-'))
                {
                    s.push(exp.charAt(i));
                }
                else if((exp.charAt(i)=='/' || exp.charAt(i)=='*') && validForMulDiv(s))
                {
                    while(!s.isEmpty() && validForMulDiv(s))
                        {
                            sb.append(s.pop());
                        }
                        s.push(exp.charAt(i));
                }
                else if((exp.charAt(i)=='+' || exp.charAt(i)=='-')  && validForPlusMinus(s))
                {
                    while(!s.isEmpty() && validForPlusMinus(s))
                        {
                            sb.append(s.pop());
                        }
                        s.push(exp.charAt(i));
                }
                else 
                    s.push(exp.charAt(i));
            }
        }
        while(!s.isEmpty())
            sb.append(s.pop());
        return sb.toString();
    }
 public static boolean validForPlusMinus(Stack<Character> s)
 {
	 return (s.peek()=='/' || s.peek()=='*' || s.peek()=='+' || s.peek()=='-' || s.peek()=='^');
 }
 public static boolean validForMulDiv(Stack<Character> s)
 {
	 return  (s.peek()=='/' || s.peek()=='*' || s.peek()=='^');
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(infixToPostfix(s));
		sc.close();
	}

}
