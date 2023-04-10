package recursiondifficult;

import java.util.ArrayList;
import java.util.Scanner;

public class RatInAMaze {
	 public static void print(int[][] arr,int r,int c,ArrayList<String> arr1,String p)
	    {
	        if(r==arr.length-1 && c==arr[0].length-1)
	        {
	            if(arr[r][c]==0)
	                return;
	            arr1.add(p);
	            return;
	        }
	        if(arr[r][c]==0)
	            return;
	        arr[r][c]=0;
	        if(r<arr.length-1)
	        {
	            print(arr,r+1,c,arr1,p+'D');
	        }
	        if(c<arr.length-1)
	        {
	            print(arr,r,c+1,arr1,p+'R');
	        }
	        if(r>0)
	        {
	            print(arr,r-1,c,arr1,p+'U');
	        }
	        if(c>0)
	        {
	            print(arr,r,c-1,arr1,p+'L');
	        }
	        arr[r][c]=1;
	    }
	    public static ArrayList<String> findPath(int[][] m) {
	        ArrayList<String> arr=new ArrayList<>();
	        print(m,0,0,arr,"");
	        return arr;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,1,1},{1,1,0},{1,1,1}};
		System.out.println(findPath(arr));
		sc.close();
	}

}
