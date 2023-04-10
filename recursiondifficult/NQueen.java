package recursiondifficult;

public class NQueen {
	public static void display(boolean[][] board)
	{
		for(boolean[] i:board)
		{
			for(boolean j:i)
			{
				if(j)
					System.out.print("Q");
				else
					System.out.print("X");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		boolean[][] board=new boolean[4][4];
		solve(board,0);
	}
	private static void solve(boolean[][] board, int r) {
		if(r==board.length)
		{
			display(board);
			return;
		}
		for(int c=0;c<board[0].length;c++)
		{
			if(isSafe(board,r,c))
			{
				board[r][c]=true;
				solve(board,r+1);
				board[r][c]=false;
			}
		}
	}
	private static boolean isSafe(boolean[][] board, int r, int c) {
		for(int i=0;i<r;i++)
		{
			if(board[i][c])
				return false;
		}
		int maxleft=Math.min(r, c);
		int maxright=Math.min(r, board.length-1-c);
		for(int i=1;i<=maxleft;i++)
		{
			if(board[r-i][c-i])
				return false;
		}
		for(int i=1;i<=maxright;i++)
		{
			if(board[r-i][c+i])
				return false;
		}
		return true;
	}

}
