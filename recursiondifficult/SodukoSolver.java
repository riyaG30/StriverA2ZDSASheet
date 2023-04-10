package recursiondifficult;

public class SodukoSolver {
	public static void display(int[][] board)
	{
		for(int[] i:board)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] soduko={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0} };
		if(solve(soduko,0,0))
		{
			display(soduko);
		}
	}
	private static boolean solve(int[][] board, int r, int c) {
		if(r==board.length-1 && c==board.length)
			return true;
		if(c==board.length)
		{
			r++;
			c=0;
		}
		if(board[r][c]!=0)
			return solve(board,r,c+1);
		for(int i=1;i<=9;i++)
		{
			if(isSafe(board,r,c,i))
			{
				board[r][c]=i;
				if(solve(board,r,c+1))
					return true;
			}
				board[r][c]=0;
		}
		return false;
	}
	private static boolean isSafe(int[][] board, int r, int c, int num) {
		for(int i=0;i<board.length;i++)
		{
			if(board[r][i]==num)
				return false;
		}
		for(int i=0;i<board[0].length;i++)
		{
			if(board[i][c]==num)
				return false;
		}
		int n=(int)Math.sqrt(board.length);
		int row=r-r%n;;
		int col=c-c%n;
		for(int i=row;i<row+n;i++)
		{
			for(int j=col;j<col+n;j++)
			{
				if(board[i][j]==num)
					return false;
			}
		}
		return true;
	}
}
