package Islands;

import java.util.List;
import java.util.ArrayList;

public class Islands {
	public static void main(String[] args) {
		int a[][] = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 1 }, 
			{ 0, 0, 0, 1, 0 }, 
			{ 1, 0, 1, 0, 1 } };
			System.out.println(new Islands().countIsland(a));
	}

	private int countIsland(int a[][]) {
		int count =0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(a[i][j]==1) {
					count++;
					dfs(a,5,5,i,j);
				}
			}
		}
		return count;
	}

	private void dfs(int[][] a, int tR, int tC, int r, int c) {
		if(isSafe(tR,tC,r,c)&&a[r][c]==1) {
			a[r][c]=0;
			dfs(a,tR,tC,r+1,c);
			dfs(a,tR,tC,r-1,c);
			dfs(a,tR,tC,r,c+1);
			dfs(a,tR,tC,r,c-1);
			dfs(a,tR,tC,r+1,c+1);
			dfs(a,tR,tC,r-1,c+1);
			dfs(a,tR,tC,r+1,c-1);
			dfs(a,tR,tC,r-1,c-1);
		}
	}

	private boolean isSafe(int tR, int tC, int r, int c) {
		return r>-1&&r<tR&&c<tC&&c>-1;
	}
}
