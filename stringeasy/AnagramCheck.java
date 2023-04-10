package stringeasy;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		sc.close();
		if(a.length()!=b.length())
		{
			System.out.println("false");
			return;
		}
       int[] arr=new int[256];
       for(int i=0;i<a.length();i++)
       {
           arr[a.charAt(i)]++;
           arr[b.charAt(i)]--;
       }
       for(int i=0;i<256;i++)
       {
           if(arr[i]!=0)
            {
        	   System.out.println("false");
   			return;
            }
       }
       System.out.println("true");

	}

}
