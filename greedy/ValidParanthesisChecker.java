package greedy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesisChecker {
	 static boolean ispar(String x)
	    {
	        if(x.length()%2!=0)
	            return false;
	        Stack<Character> s=new Stack<>();
	        for(int i=0;i<x.length();i++)
	        {
	            if(x.charAt(i)=='(' || x.charAt(i)=='[' || x.charAt(i)=='{')
	                s.push(x.charAt(i));
	            else
	            {
	                if(s.isEmpty())
	                    return false;
	                if((x.charAt(i)==')' && s.peek()=='(') || (x.charAt(i)==']' && s.peek()=='[') || (x.charAt(i)=='}' && s.peek()=='{'))
	                    s.pop();
	                else 
	                    return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String s=sc.next();
		System.out.println(ispar(s));
		sc.close();
	}

}
