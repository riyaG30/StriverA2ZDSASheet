package stacknotations;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
	static String preToInfix(String exp) {
        Stack<String> s=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--)
        {
            if(!Character.isAlphabetic(exp.charAt(i)))
            {
                String A=s.pop();
                String B=s.pop();
                String C="("+A+exp.charAt(i)+B+")";
                s.push(C);
            }
            else
                s.push(exp.charAt(i)+"");
        }
        return s.peek();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(preToInfix(s));
		sc.close();
	}
}
