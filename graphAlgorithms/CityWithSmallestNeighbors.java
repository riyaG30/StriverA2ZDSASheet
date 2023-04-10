package graphAlgorithms;

import java.util.Arrays;

public class CityWithSmallestNeighbors {
	int findCity(int n, int m, int[][] edge,int distanceThreshold)
    {
        int[][] distance=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<m;i++)
        {
            int u=edge[i][0];
            int v=edge[i][1];
            int w=edge[i][2];
            distance[u][v]=w;
            distance[v][u]=w;
        }
        for(int i=0;i<n;i++)
          distance[i][i]=0;
	        for(int k=0;k<n;k++)
	        {
	            for(int i=0;i<n;i++)
	            {
	                for(int j=0;j<n;j++)
	                {
	                    if(distance[i][k]==Integer.MAX_VALUE || distance[k][j]==Integer.MAX_VALUE)
	                        continue;
	                    distance[i][j] = Math.min(distance[i][j],distance[i][k] + distance[k][j]);
	                }
	            }
	        }
	        int city=n;
	        int cityNumber=-1;
	         for(int i=0;i<n;i++)
	        {
	            int countOfCity=0;
	            for(int j=0;j<n;j++)
	            {
	                if(distance[i][j]<=distanceThreshold)
	                {
	                    countOfCity++;
	                }
	            }
	            if(countOfCity<=city)
	            {
	                city=countOfCity;
	                cityNumber=i;
	            }
	        }
	        return cityNumber;
    }
}
