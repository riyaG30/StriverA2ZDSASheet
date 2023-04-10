package graphAlgorithms;

public class FloydWarshallAlgortihm {
	//This algorithm can also be used to findshortest distance for multiple paths
	//This is a multi path shortest distance algorithm
	//In this algorithm we can also find negative cycle as well
	 public void shortest_distance(int[][] matrix)
	    {
	        int n=matrix.length;
	        int m=matrix[0].length;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(matrix[i][j]==-1)
	                    matrix[i][j]=(int)1e9;
	            }
	        }
	        for(int k=0;k<n;k++)
	        {
	            for(int i=0;i<n;i++)
	            {
	                for(int j=0;j<m;j++)
	                {
	                    matrix[i][j] = Math.min(matrix[i][j],matrix[i][k] + matrix[k][j]);
	                }
	            }
	        }
	        //for checking negative  cycle
	        for(int i=0;i<n;i++)
	        {
	        	if(matrix[i][i]<0)
	        		return ;
	        }
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if(matrix[i][j]==(int)1e9)
	                    matrix[i][j]=-1;
	            }
	        }
	    }
}
