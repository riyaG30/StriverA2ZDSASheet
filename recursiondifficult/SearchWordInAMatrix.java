package recursiondifficult;

import java.util.Scanner;

public class SearchWordInAMatrix {
	 public static boolean exist(char[][] board, String word) {
	        for(int i=0;i<board.length;i++)
	        {
	            for(int j=0;j<board[0].length;j++)
	            {
	                if(word.charAt(0)==board[i][j])
	                {
	                    if(exist(board,word,i,j,0))
	                        return true;
	                }
	            }
	        }
	        return false;
	    }
	    public static boolean exist(char[][] board,String word,int r,int c,int index)
	    {
	        if(index==word.length())
	            return true;
	        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='#' || board[r][c]!=word.charAt(index))
	            return false;
	        board[r][c]='#';
	        if(exist(board,word,r,c+1,index+1)|| exist(board,word,r,c-1,index+1) ||exist(board,word,r+1,c,index+1) ||exist(board,word,r-1,c,index+1))
	            return true;
	        board[r][c]=word.charAt(index);
	        return false;
	        
	            
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] board=new char[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				board[i][j]=sc.next().charAt(0);
			}
		}
		String s=sc.next();
		System.out.println(exist(board,s));
		sc.close();
		sc.close();
	}

}
