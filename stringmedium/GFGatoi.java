package stringmedium;

import java.util.Scanner;

public class GFGatoi {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
        if(str.charAt(i)==  '-')
            i=1;
        for(;i<str.length();i++)
        {
            if(!Character.isDigit(str.charAt(i)))
                return ;
        }
        System.out.println(Integer.parseInt(str));
        sc.close();
	}

}
