package stringeasy;

import java.util.Scanner;

public class LongestPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		sc.close();
		if(arr.length==0)
		{
			System.out.println("-1");
			return;
		}
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        if(prefix.length()==0)
        {
        	System.out.println("-1");
        	return;
        }
        System.out.println(prefix);
      
	}

}
